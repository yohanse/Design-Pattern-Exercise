package mediatotr;

public class Button extends UIControl {
    private boolean isEnabled;

    public Button(DialogBox owner) {
        super(owner);
    }

    public boolean getEnable(){
        return isEnabled;
    }

    public void setEnable(boolean isEnabled){
        this.isEnabled = isEnabled;
        owner.change(this);
    }
}
