package memento;

public class Memento {
    private String content;

    public Memento (String content){
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
