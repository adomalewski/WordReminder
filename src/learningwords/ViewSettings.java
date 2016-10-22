package learningwords;

import learningwords.enums.FromLanguageMethodE;

public class ViewSettings extends View {
    @Override
    public void showLayer() { WordsJDialog.jSettingsLayer.show(); }
    
    @Override
    public void hideLayer() { WordsJDialog.jSettingsLayer.hide(); }
    
    public void changeSettings(SettingsData settings) {
        switch(settings.fromLanguageMethod) {
            case POLISH: WordsJDialog.jRadioButton1Polish.doClick();
                break;
            case ENGLISH: WordsJDialog.jRadioButton2English.doClick();
                break;
            case RANDOM: WordsJDialog.jRadioButton3Random.doClick();
                break;
        }
        
        WordsJDialog.jTextField2SuspendTime.setText(String.valueOf(settings.suspendTimeInMinutes));
        
        if(settings.hideAfterSuccess && !WordsJDialog.jCheckBox1HideAfterSuccess.isSelected())
            WordsJDialog.jCheckBox1HideAfterSuccess.doClick();
        if(!settings.hideAfterSuccess && WordsJDialog.jCheckBox1HideAfterSuccess.isSelected())
            WordsJDialog.jCheckBox1HideAfterSuccess.doClick();
    }
    
    public SettingsData getCurrentSettings() {
        SettingsData settings = new SettingsData();
        
        if(WordsJDialog.jRadioButton1Polish.isSelected())
            settings.fromLanguageMethod = FromLanguageMethodE.POLISH;
        else if(WordsJDialog.jRadioButton2English.isSelected())
            settings.fromLanguageMethod = FromLanguageMethodE.ENGLISH;
        else if(WordsJDialog.jRadioButton3Random.isSelected())
            settings.fromLanguageMethod = FromLanguageMethodE.RANDOM;
        
        settings.suspendTimeInMinutes = Integer.parseInt(WordsJDialog.jTextField2SuspendTime.getText());
        settings.hideAfterSuccess = WordsJDialog.jCheckBox1HideAfterSuccess.isSelected();
        
        return settings;
    }
}
