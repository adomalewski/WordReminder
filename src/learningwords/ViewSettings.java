package learningwords;

import learningwords.enums.ViewTypeE;

public class ViewSettings extends View {
    void showLayer() { WordsJDialog.jSettingsLayer.show(); }
    void hideLayer() { WordsJDialog.jSettingsLayer.hide(); }
    
    @Override
    public void update() {
        switch(appLogic.viewElemStateChange.viewLayersActions.get(ViewTypeE.SETTINGS)) {
            case SHOW: showLayer(); break;
            case HIDE: hideLayer(); break;
        }
    }
}
