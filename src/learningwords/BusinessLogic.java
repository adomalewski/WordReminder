package learningwords;

import java.util.LinkedList;
import java.util.List;

public class BusinessLogic {
    public AppSettings appSettings;
    private boolean displayingApp;
    public ViewElementsStateChange viewElemStateChange;
    private List<View> views;
    
    public BusinessLogic() {
        views = new LinkedList<>();
        appSettings = new AppSettings();
        viewElemStateChange.clearActions();
        displayingApp = true;
    }
    
    public void changeDisplayingApp(boolean showState) { 
        displayingApp = showState;

        if(displayingApp == false) {
            //set timer
        }
    }
    
    public void startApp() {}
   
    public void addView(View view) { views.add(view); }
    
    public void notifyViews() {
        for(View view : views)
            view.update();
        
        viewElemStateChange.clearActions();
    }
}
