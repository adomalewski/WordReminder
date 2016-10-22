package learningwords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    String chosenWord;
    List<String> missingWords;
    List<String> incorrectWords;
    
    //additional settings
    String wordsFileName;
    String settingsFileName;
    Integer suspendTimeInMinutes;
    boolean hideAfterSuccess;
    
    public AppSettings() {
        wordsDataList = new LinkedList<>();
        solutionList = new LinkedList<>();
        userWords = new LinkedList<>();
        missingWords = new LinkedList<>();
        incorrectWords = new LinkedList<>();
        wordsFileName = "wordsEn.txt";
        settingsFileName = "settings";
        
        //should be that method instead of above part
        loadSettingsFromFile();
    }
    
    public void applySettings(SettingsData settings) {
        fromLanguageMethod = settings.fromLanguageMethod;
        suspendTimeInMinutes = settings.suspendTimeInMinutes;
        hideAfterSuccess = settings.hideAfterSuccess;
                
        saveSettingsToFile();
    }
    
    private void saveSettingsToFile() {
        List<String> settFileRecords = new LinkedList<>();
        try {
            File file = new File(settingsFileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            for(String line; (line = br.readLine()) != null;)
                settFileRecords.add(line);
            br.close();
    
            FileWriter fw = new FileWriter(settingsFileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter fileOut = new PrintWriter(bw);
            
            for(String line : settFileRecords) {
                line = line.trim();
                
                if(line.startsWith("fromLanguageMethod")) {
                    fileOut.print("fromLanguageMethod ");
                    switch(fromLanguageMethod) {
                        case POLISH: fileOut.println("polish");
                            break;
                        case ENGLISH: fileOut.println("english");
                            break;
                        case RANDOM: fileOut.println("random");
                            break;
                    }
                    continue;
                }
                
                if(line.startsWith("suspendTime")) {
                    fileOut.println("suspendTime " + String.valueOf(suspendTimeInMinutes));
                    continue;
                }
                
                if(line.startsWith("hideAfterSuccess")) {
                    fileOut.print("hideAfterSuccess ");
                    if(hideAfterSuccess)
                        fileOut.println("true");
                    else
                        fileOut.println("false");
                    continue;
                }
                
                fileOut.println(line);
            }
            
            fileOut.close();
        } catch (IOException ex) {
           Logger.getLogger(AppSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadSettingsFromFile() {
        File file = new File(settingsFileName);
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null;) {
                line = line.trim();
                if(line.startsWith("#"))
                    continue;
                
                if(line.startsWith("fromLanguageMethod")) {
                    switch(line.split(" ")[1]) {
                        case "polish": fromLanguageMethod = FromLanguageMethodE.POLISH;
                            break;
                        case "english": fromLanguageMethod = FromLanguageMethodE.ENGLISH;
                            break;
                        case "random": fromLanguageMethod = FromLanguageMethodE.RANDOM;
                            break;
                    }
                }
                
                if(line.startsWith("suspendTime"))
                    suspendTimeInMinutes = Integer.parseInt(line.split(" ")[1]);
                
                if(line.startsWith("hideAfterSuccess")) {
                    if(line.split(" ")[1].equals("true"))
                        hideAfterSuccess = true;
                    else
                        hideAfterSuccess = false;
                }
            }
        } catch (IOException ex) {
           Logger.getLogger(AppSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadWordsDataFromFile() {
        File file = new File(wordsFileName);
        Date fileModificationDate = new Date(file.lastModified());
        if(lastParsingTime == null || fileModificationDate.after(lastParsingTime)) {
            lastParsingTime = new Date();
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
