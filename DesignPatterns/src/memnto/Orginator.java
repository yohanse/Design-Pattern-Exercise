package memnto;

public class Orginator {
    private String content;

    public Orginator(String content){
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setMemento(Memento state) {
        this.content = state.getContent();
    }

    public Memento createMemento() {
        return new Memento(this.content);
    }
}
