package learningwords;

public abstract class View {
    protected static BusinessLogic appLogic;
    protected static void setModel(BusinessLogic _appLogic) { appLogic = _appLogic; }
    
    public abstract void update();
}
