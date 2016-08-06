package learningwords;

import learningwords.enums.DynamicViewElementE;

public class ViewTopBar extends View {
    public void update() {
        switch(appLogic.viewElemStateChange.dynamicVElemsActions.get(DynamicViewElementE.BTN_SETTINGS)) {
            case SHOW: WordsJDialog.jButton3Settings.show(); break;
            case HIDE: WordsJDialog.jButton3Settings.hide(); break;
        }
    }
}
