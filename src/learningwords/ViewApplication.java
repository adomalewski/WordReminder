package learningwords;

import learningwords.enums.ViewTypeE;

public class ViewApplication extends View {
    public void update() {
        switch(appLogic.viewElemStateChange.viewLayersActions.get(ViewTypeE.APPLICATION)) {
            case SHOW: WordsJDialog.dialog.show(); break;
            case HIDE: WordsJDialog.dialog.hide(); break;
        }
    }
}
