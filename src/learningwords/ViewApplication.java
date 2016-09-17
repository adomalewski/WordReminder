package learningwords;

import static java.awt.Frame.ICONIFIED;

public class ViewApplication extends View {
    @Override
    public void showLayer() { WordsJDialog.dialog.show(); }
    
    @Override
    public void hideLayer() { WordsJDialog.dialog.setExtendedState(ICONIFIED); }
}
