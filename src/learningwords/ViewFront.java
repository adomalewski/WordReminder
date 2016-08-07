package learningwords;

import static learningwords.View.appLogic;
import learningwords.enums.ViewTypeE;
import learningwords.enums.DynamicViewElementE;
import learningwords.enums.ElementActionE;

public class ViewFront extends View {
    void showLayer() { WordsJDialog.jFrontLayer.show(); }
    void hideLayer() { WordsJDialog.jFrontLayer.hide(); }
    
    @Override
    public void update() {
        ElementActionE frontViewAction = appLogic.viewElemStateChange.viewLayersActions.get(ViewTypeE.FRONT);
        if(frontViewAction != null) {
            switch(frontViewAction) {
                case SHOW: showLayer(); break;
                case HIDE: hideLayer(); break;
            }
        }
        
        ElementActionE btnCheckNextAction = appLogic.viewElemStateChange.dynamicVElemsActions.get(DynamicViewElementE.BTN_CHECK_NEXT);
        if(btnCheckNextAction != null) {
            switch(btnCheckNextAction) {
                case CHECK_NEXT: break;
                case NEXT: break;
            }
        }
    }
}
