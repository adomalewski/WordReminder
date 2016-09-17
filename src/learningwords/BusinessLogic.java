package learningwords;

import java.util.Timer;
import java.util.TimerTask;

public class BusinessLogic {
    protected AppSettings appSettings;

    protected boolean displayingApp;    
    private Timer hideAppTimer;
    
    protected ViewApplication viewApplication;
    protected ViewFront viewFront;
    protected ViewSettings viewSettings;
    protected ViewTopBar viewTopBar;
    
    final private static int msInHour = 60*60*1000;
    
    public BusinessLogic(
            ViewApplication _viewApplication,
            ViewFront _viewFront,
            ViewSettings _viewSettings,
            ViewTopBar _viewTopBar) {
        appSettings = new AppSettings();
        displayingApp = true;
        hideAppTimer = new Timer();
        
        viewApplication = _viewApplication;
        viewFront = _viewFront;
        viewSettings = _viewSettings;
        viewTopBar = _viewTopBar;
    }
    
    private void changeDisplayingApp(boolean showState) { 
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
    
    public void startApp() {
        viewSettings.hideLayer();
    }
    
    public void showSettings() {
        viewTopBar.setVisibilitySettingsButton(false);
        viewFront.hideLayer();
        viewSettings.showLayer();
    }
    
    public void hideApplication() {
        changeDisplayingApp(false);
        viewApplication.hideLayer();
    }
    
    public void applySettings() {
        appSettings.applySettings();
        viewSettings.hideLayer();
        viewFront.showLayer();
        viewTopBar.setVisibilitySettingsButton(true);
        applyFrontViewLogic();
    }
    
    public void abortSettings() {
        viewSettings.hideLayer();
        viewFront.showLayer();
        viewTopBar.setVisibilitySettingsButton(true);
    }
    
    protected void applyFrontViewLogic() {
        
    }
}
