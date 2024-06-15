import memento.Editor;
import memento.EditorHistory;

public class App {
    public static void main(String[] args) throws Exception {
        var editor = new Editor();
        var editorHistory = new EditorHistory();

        editor.setContent("a");
        editorHistory.push(editor.createState());

        editor.setContent("b");
        editorHistory.push(editor.createState());

        editor.setContent("c");

        System.out.println(editor.getContent());

        editor.restoreState(editorHistory.pop());
        System.out.println(editor.getContent());

        editor.restoreState(editorHistory.pop());
        System.out.println(editor.getContent());


    }
}
