package learningwords;

import learningwords.enums.ViewTypeE;
import learningwords.enums.DynamicViewElementE;

public class ViewFront extends View {
    void showLayer() { WordsJDialog.jFrontLayer.show(); }
    void hideLayer() { WordsJDialog.jFrontLayer.hide(); }
    
    @Override
    public void update() {
        switch(appLogic.viewElemStateChange.viewLayersActions.get(ViewTypeE.FRONT)) {
            case SHOW: showLayer(); break;
            case HIDE: hideLayer(); break;
        }
        
        switch(appLogic.viewElemStateChange.dynamicVElemsActions.get(DynamicViewElementE.BTN_CHECK_NEXT)) {
            case CHECK_NEXT: break;
            case NEXT: break;
        }
    }
}
