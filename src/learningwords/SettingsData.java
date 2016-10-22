package learningwords;

import learningwords.enums.FromLanguageMethodE;

public class SettingsData {
    FromLanguageMethodE fromLanguageMethod;
    Integer suspendTimeInMinutes;
    boolean hideAfterSuccess;
    
    public SettingsData() {   
    }
    
    public SettingsData(
            FromLanguageMethodE _fromLanguageMethod,
            Integer _suspendTimeInMinutes,
            boolean _hideAfterSuccess) {
        fromLanguageMethod = _fromLanguageMethod;
        suspendTimeInMinutes = _suspendTimeInMinutes;
        hideAfterSuccess = _hideAfterSuccess;
    }
}
