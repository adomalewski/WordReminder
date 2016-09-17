package learningwords;

public class ViewSettings extends View {
    @Override
    public void showLayer() { WordsJDialog.jSettingsLayer.show(); }
    
    @Override
    public void hideLayer() { WordsJDialog.jSettingsLayer.hide(); }
}
