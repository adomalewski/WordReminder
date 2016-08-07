package learningwords;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class BusinessLogic {
    public AppSettings appSettings;
    private boolean displayingApp;
    public ViewElementsStateChange viewElemStateChange;
    private List<View> views;
    private Timer hideAppTimer;
    
    final private static int msInHour = 60*60*1000;
    
    public BusinessLogic() {
        views = new LinkedList<>();
        appSettings = new AppSettings();
        viewElemStateChange.clearActions();
        displayingApp = true;
        hideAppTimer = new Timer();
    }
    
    public void changeDisplayingApp(boolean showState) { 
        displayingApp = showState;

        if(displayingApp == false) {
            if(hideAppTimer != null)
                hideAppTimer.purge();
            
            hideAppTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    displayingApp = true;
                }
            }, msInHour * appSettings.suspendTimeInHours);
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
