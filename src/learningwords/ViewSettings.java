package learningwords;

import learningwords.enums.DynamicViewElementE;
import learningwords.enums.ElementActionE;
import learningwords.enums.ViewTypeE;

public class ViewSettings extends View {
    void showLayer() { WordsJDialog.jSettingsLayer.show(); }
    void hideLayer() { WordsJDialog.jSettingsLayer.hide(); }
    
    @Override
    public void update() {
        ElementActionE settingsViewAction = appLogic.viewElemStateChange.viewLayersActions.get(ViewTypeE.SETTINGS);
        if(settingsViewAction == null)
            return;
        
        switch(settingsViewAction) {
            case SHOW: showLayer(); break;
            case HIDE: hideLayer(); break;
        }
    }
}
