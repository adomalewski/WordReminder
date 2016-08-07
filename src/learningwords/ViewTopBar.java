package learningwords;

import learningwords.enums.DynamicViewElementE;
import learningwords.enums.ElementActionE;

public class ViewTopBar extends View {
    @Override
    public void update() {
        ElementActionE btnSettingsAction = appLogic.viewElemStateChange.dynamicVElemsActions.get(DynamicViewElementE.BTN_SETTINGS);
        if(btnSettingsAction == null)
            return;
        
        switch(btnSettingsAction) {
            case SHOW: WordsJDialog.jButton3Settings.show(); break;
            case HIDE: WordsJDialog.jButton3Settings.hide(); break;
        }
    }
}
