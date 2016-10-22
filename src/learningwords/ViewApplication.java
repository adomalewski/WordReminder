package learningwords;

import static java.awt.Frame.ICONIFIED;
import javax.swing.JFrame;

public class ViewApplication extends View {
    @Override
    public void showLayer() {
        WordsJDialog.dialog.show();
        WordsJDialog.dialog.setExtendedState(JFrame.NORMAL);
    }
    
    @Override
    public void hideLayer() { WordsJDialog.dialog.setExtendedState(ICONIFIED); }
}
