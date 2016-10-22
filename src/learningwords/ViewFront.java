package learningwords;

public class ViewFront extends View {
    private boolean visibleButtonNext;
    
    @Override
    public void showLayer() { WordsJDialog.jFrontLayer.show(); }
    
    @Override
    public void hideLayer() { WordsJDialog.jFrontLayer.hide(); }
    
    public void setAskWord(String word) {
        WordsJDialog.jLabel12GuessWord.setText(word);
    }
    
    public void setSolutionNumber(int solutions) {
        WordsJDialog.jLabel3Solutions.setText(String.valueOf(solutions));
    }
    
    public void setVisibilityMissingWords(boolean visibility) {
        if(visibility) {
            WordsJDialog.jLabel5MissingWords.show();
            WordsJDialog.jLabel4MissingStatic.show();
        }
        else {
            WordsJDialog.jLabel5MissingWords.hide();
            WordsJDialog.jLabel4MissingStatic.hide();
        }
    }
    
    public void setVisibilityIncorrectWords(boolean visibility) {
        if(visibility) {
            WordsJDialog.jLabel7IncorrectWords.show();
            WordsJDialog.jLabel6IncorrectStatic.show();
        }
        else {
            WordsJDialog.jLabel7IncorrectWords.hide();
            WordsJDialog.jLabel6IncorrectStatic.hide();
        }
    }
    
    public void setMissingWords(String text) {
        WordsJDialog.jLabel5MissingWords.setText(text);
    }
    
    public void setIncorrectWords(String text) {
        WordsJDialog.jLabel7IncorrectWords.setText(text);
    }
    
    public String getUserText() {
        return WordsJDialog.jTextField1UserTranslation.getText();
    }
    
    public void setVisibilityButtonApprove(boolean visibility) {
        if(visibility)
            WordsJDialog.jButton1Approve.show();
        else
            WordsJDialog.jButton1Approve.hide();
    }

    public boolean isVisibleButtonNext() {
        return visibleButtonNext;
    }

    public void setVisibleButtonNext(boolean visibleButtonNext) {
        this.visibleButtonNext = visibleButtonNext;
        if(visibleButtonNext)
            showButtonNext();
        else
            showButtonCheckNext();
    }
    
    protected void showButtonCheckNext() {
        WordsJDialog.jButton1CheckNext.setText("Check & Next");
    }
    
    protected void showButtonNext() {
        WordsJDialog.jButton1CheckNext.setText("Next");
    }
    
    public void clearUserText() {
        WordsJDialog.jTextField1UserTranslation.setText("");
    }
}
