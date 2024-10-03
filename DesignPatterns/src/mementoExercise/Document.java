package mementoExercise;
public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentMemento createMemento() {
        return new DocumentMemento(content, fontName, fontSize);
    }

    public void setMemento(DocumentMemento memento) {
        this.content = memento.getContent();
        this.fontName = memento.getFontName();
        this.fontSize = memento.getFontSize();
    }

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}