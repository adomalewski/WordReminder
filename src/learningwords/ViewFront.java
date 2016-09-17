package learningwords;

public class ViewFront extends View {
    @Override
    public void showLayer() { WordsJDialog.jFrontLayer.show(); }
    
    @Override
    public void hideLayer() { WordsJDialog.jFrontLayer.hide(); }
}
