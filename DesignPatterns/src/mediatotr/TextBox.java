package mediatotr;

public class TextBox extends UIControl{
    private String text;

    public TextBox(DialogBox owner) {
        super(owner);
    }

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text = text;
        owner.change(this);
    }
}
