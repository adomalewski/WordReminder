package learningwords;

public class ViewTopBar extends View {
    public void setVisibilitySettingsButton(boolean visibility)
    {
        if(visibility == true)
            WordsJDialog.jButton3Settings.show();
        else
            WordsJDialog.jButton3Settings.hide();
    }
}
