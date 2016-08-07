package learningwords;

import static java.awt.Frame.ICONIFIED;
import learningwords.enums.ElementActionE;
import learningwords.enums.ViewTypeE;

public class ViewApplication extends View {
    @Override
    public void update() {
        ElementActionE appViewAction = appLogic.viewElemStateChange.viewLayersActions.get(ViewTypeE.APPLICATION);
        if(appViewAction == null)
            return;
        
        switch(appViewAction) {
            case SHOW: WordsJDialog.dialog.show(); break;
            case HIDE: WordsJDialog.dialog.setExtendedState(ICONIFIED); break;
        }
    }
}
