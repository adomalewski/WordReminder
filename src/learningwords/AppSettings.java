package learningwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import learningwords.enums.FromLanguageMethodE;
import learningwords.enums.LanguageE;

public class AppSettings {
    FromLanguageMethodE fromLanguageMethod;
    LanguageE wordLanguage;
    List<Pair<String, List<String>>> wordsDataList;
    Date lastParsingTime = null;
    List<String> solutionList;
    List<String> userWords;
    String choseWord;
    List<String> missedWords;
    List<String> incorrectWords;
    
    //additional settings
    String wordsFileName;
    String settingsFileName;
    Integer suspendTimeInHours;
    boolean hideAfterSuccess;
    
    public AppSettings() {
        wordsDataList = new LinkedList<>();
        fromLanguageMethod = FromLanguageMethodE.RANDOM;
        wordsFileName = "wordsEn.txt";
        settingsFileName = "settings";
        suspendTimeInHours = 1;
        hideAfterSuccess = true;
    }
    
    public void applySettings() {
        if(WordsJDialog.jRadioButton1Polish.isSelected())
            fromLanguageMethod = FromLanguageMethodE.POLISH;
        else if(WordsJDialog.jRadioButton2English.isSelected())
            fromLanguageMethod = FromLanguageMethodE.ENGLISH;
        else if(WordsJDialog.jRadioButton3Random.isSelected())
            fromLanguageMethod = FromLanguageMethodE.RANDOM;
        
        suspendTimeInHours = Integer.parseInt(WordsJDialog.jTextField2SuspendTime.getText());
        hideAfterSuccess = WordsJDialog.jCheckBox1HideAfterSuccess.isSelected();
                
        saveSettingsToFile();
    }
    
    private void saveSettingsToFile() {}
    public void loadSettingsFromFile() {}
    
    public void loadWordsDataFromFile() {
        File file = new File(wordsFileName);
        Date fileModificationDate = new Date(file.lastModified());
        if(lastParsingTime == null || fileModificationDate.after(lastParsingTime)) {
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                for(String line; (line = br.readLine()) != null;) {
                    String[] languagesBaskets = line.split(";");
                    List<String> translationBasket = new LinkedList<>();

                    for(String word : languagesBaskets[1].split(","))
                        translationBasket.add(word.trim());

                    wordsDataList.add(new Pair<>(languagesBaskets[0].trim(), translationBasket));
                }
            } catch (IOException ex) {
               Logger.getLogger(AppSettings.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }
}
