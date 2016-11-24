package learningwords;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;
import javafx.util.Pair;
import learningwords.enums.LanguageE;
import java.util.concurrent.ThreadLocalRandom;

public class BusinessLogic {
    protected AppSettings appSettings;

    protected boolean displayingApp;    
    private Timer hideAppTimer;
    
    protected ViewApplication viewApplication;
    protected ViewFront viewFront;
    protected ViewSettings viewSettings;
    protected ViewTopBar viewTopBar;
    
    final private static int msInMin = 60*1000;
    
    public BusinessLogic(
            ViewApplication _viewApplication,
            ViewFront _viewFront,
            ViewSettings _viewSettings,
            ViewTopBar _viewTopBar) {
        viewApplication = _viewApplication;
        viewFront = _viewFront;
        viewSettings = _viewSettings;
        viewTopBar = _viewTopBar;
        
        appSettings = new AppSettings();
        displayingApp = true;
        hideAppTimer = new Timer();
    }
    
    public void startApp() {
        viewSettings.hideLayer();
        viewSettings.changeSettings(getSettingsData());
        appSettings.loadWordsDataFromFile();
        prepareAskUser();
    }
    
    public void showSettings() {
        viewTopBar.setVisibilitySettingsButton(false);
        viewFront.hideLayer();
        viewSettings.showLayer();
    }
    
    public void hideApplication() {
        setAppVisibility(false);
    }
    
    public void applySettings() {
        viewSettings.hideLayer();
        viewFront.showLayer();
        viewTopBar.setVisibilitySettingsButton(true);
        appSettings.applySettings(viewSettings.getCurrentSettings());
        if(!viewFront.isVisibleButtonNext()) {
            appSettings.loadWordsDataFromFile();
            prepareAskUser();
        }
    }
    
    public void abortSettings() {
        viewSettings.hideLayer();
        viewFront.showLayer();
        viewTopBar.setVisibilitySettingsButton(true);
        viewSettings.changeSettings(getSettingsData());
    }
    
    public void approveUserAnswer() {
        getUserAnswer();
        findMissingWords();
        findIncorrectWords();
        manageAppFlowByUserAnswer(true);
    }
    
    public void checkNextButtonMechanism() {
        if(viewFront.isVisibleButtonNext()) {
            appSettings.loadWordsDataFromFile();
            prepareAskUser();
        }
        else {
            getUserAnswer();
            findMissingWords();
            findIncorrectWords();
            manageAppFlowByUserAnswer(false);
        }
    }
    
    public void prepareShowApp() {
        viewApplication.showLayer();
        hideAppTimer.cancel();
        hideAppTimer = new Timer();
    }
    
    public SettingsData getSettingsData() {
        return new SettingsData(
            appSettings.fromLanguageMethod,
            appSettings.suspendTimeInMinutes,
            appSettings.hideAfterSuccess);
    }
    
    protected void prepareAskUser() {
        viewFront.setVisibilityMissingWords(false);
        viewFront.setVisibilityIncorrectWords(false);
        viewFront.setVisibleButtonNext(false);
        viewFront.setVisibilityButtonApprove(true);
        viewFront.clearUserText();
        
        chooseAskLanguage();
        chooseWordAndSolutions();
        viewFront.setAskWord(appSettings.chosenWord);
        viewFront.setSolutionNumber(appSettings.solutionList.size());
    }
    
    protected void manageAppFlowByUserAnswer(boolean allowHide) {
        if(isUserAnswerCorrect()) {
            appSettings.loadWordsDataFromFile();
            prepareAskUser();
            
            if(allowHide && appSettings.hideAfterSuccess)
                setAppVisibility(false);
        }
        else {
            viewFront.setVisibilityButtonApprove(false);
            viewFront.setVisibleButtonNext(true);
            
            showAnswer();
        }
    }
    
    private void getUserAnswer() {
        String userText = viewFront.getUserText();
        appSettings.userWords.clear();
        for(String word : userText.split(";"))
            appSettings.userWords.add(word.trim());
    }
    
    private void findMissingWords() {
        boolean result;
        appSettings.missingWords.clear();
        for(String singleSolutionWord : appSettings.solutionList) {
            result = false;
            for(String singleUserWord : appSettings.userWords)
                if(singleSolutionWord.equals(singleUserWord)) {
                    result = true;
                    break;
                }
            
            if(result == false)
                appSettings.missingWords.add(singleSolutionWord);
        }
    }
    
    private void findIncorrectWords() {
        boolean result;
        appSettings.incorrectWords.clear();
        for(String singleUserWord : appSettings.userWords) {
            result = false;
            for(String singleSolutionWord : appSettings.solutionList)
                if(singleSolutionWord.equals(singleUserWord)) {
                    result = true;
                    break;
                }
            
            if(result == false)
                appSettings.incorrectWords.add(singleUserWord);
        }
    }
    
    private boolean isUserAnswerCorrect() {
        return appSettings.missingWords.isEmpty() && appSettings.incorrectWords.isEmpty();
    }
    
    private void showAnswer() {
        String text = getFormattedText4WordList(appSettings.missingWords);
        if(!text.isEmpty()) {
            viewFront.setVisibilityMissingWords(true);
            viewFront.setMissingWords(text);
        }

        text = getFormattedText4WordList(appSettings.incorrectWords);
        if(!text.isEmpty()) {
            viewFront.setVisibilityIncorrectWords(true);
            viewFront.setIncorrectWords(text);
        }
    }
    
    private void changeDisplayingApp(boolean showState) { 
        displayingApp = showState;

        if(displayingApp == false) {
            if(hideAppTimer != null)
                hideAppTimer.purge();
            
            hideAppTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    setAppVisibility(true);
                }
            }, msInMin * appSettings.suspendTimeInMinutes);
        }
    }
    
    private void setAppVisibility(boolean visibility) {
        changeDisplayingApp(visibility);
        
        if(visibility)
            viewApplication.showLayer();
        else 
            viewApplication.hideLayer();
    }
    
    private void chooseAskLanguage() {
        switch(appSettings.fromLanguageMethod) {
            case RANDOM:
                if(ThreadLocalRandom.current().nextInt(500)%2 == 0)
                    appSettings.wordLanguage = LanguageE.ENGLISH;
                else
                    appSettings.wordLanguage = LanguageE.POLISH;
                break;
            case POLISH: appSettings.wordLanguage = LanguageE.POLISH; break;
            case ENGLISH: appSettings.wordLanguage = LanguageE.ENGLISH; break;
        }
    }
    
    private void chooseWordAndSolutions() {
        if(appSettings.wordLanguage == LanguageE.ENGLISH) {
            int index = ThreadLocalRandom.current().nextInt(appSettings.wordsDataList.size());
            appSettings.chosenWord = appSettings.wordsDataList.get(index).getKey();
            
            appSettings.solutionList.clear();
            for(Pair<String, List<String>> record : appSettings.wordsDataList)
                if(record.getKey().equals(appSettings.chosenWord))
                    appSettings.solutionList.addAll(record.getValue());
        }
        else {
            int recordIndex = ThreadLocalRandom.current().nextInt(appSettings.wordsDataList.size());
            int index = ThreadLocalRandom.current().nextInt(
                appSettings.wordsDataList.get(recordIndex).getValue().size());
            appSettings.chosenWord = appSettings.wordsDataList.get(recordIndex).getValue().get(index);

            appSettings.solutionList.clear();
            for(Pair<String, List<String>> record : appSettings.wordsDataList) {
                for(String word : record.getValue()) {
                    if(word.equals(appSettings.chosenWord)) {
                        appSettings.solutionList.add(record.getKey());
                        break;
                    }
                }
            }
        }
        
        //remove duplicates
        for(ListIterator<String> it = appSettings.solutionList.listIterator(); it.hasNext();) {
            String word = it.next();
            if(Collections.frequency(appSettings.solutionList, word) > 1) {
                it.remove();
            }
        }
    }
    
    private String getFormattedText4WordList(List<String> list) {
        String output = "";
        for(String word : list)
            output += ", " + word;
        
        if(output.length() > 0)
            output = output.substring(2);
        
        return output;
    }
}
