package learningwords;

import learningwords.enums.ViewTypeE;
import learningwords.enums.ElementActionE;
import learningwords.enums.DynamicViewElementE;
import java.util.HashMap;
import java.util.Map;

public class ViewElementsStateChange {
    public static Map<ViewTypeE, ElementActionE> viewLayersActions = new HashMap<>();
    public static Map<DynamicViewElementE, ElementActionE> dynamicVElemsActions = new HashMap<>();
    
    public static void clearActions() {
        viewLayersActions.clear();
        dynamicVElemsActions.clear();
    }
}
