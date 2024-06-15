import iterator.History;
import iterator.Iterator;
import memento.Editor;
import memento.EditorHistory;
import state.Brush;
import state.Canvas;
import state.Selection;

public class App {
    public static void main(String[] args) throws Exception {
        //3. Iterator Pattern
        var browserHistory = new History<String>();
        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");
        browserHistory.push("d");

        Iterator<String> browseHistoryIterator = browserHistory.createIterator();

        while(browseHistoryIterator.hasNext()){
            System.out.println(browseHistoryIterator.currentState());
            browseHistoryIterator.next();
        }

        // 2. State object pattern
        // var canvas = new Canvas();
        // canvas.setCurrent(new Brush());
        // canvas.mouseUp();
        // canvas.mouseDown();

        // canvas.setCurrent(new Selection());
        // canvas.mouseUp();
        // canvas.mouseDown();

        // 1. Memento pattern
        // var editor = new Editor();
        // var editorHistory = new EditorHistory();

        // editor.setContent("a");
        // editorHistory.push(editor.createState());

        // editor.setContent("b");
        // editorHistory.push(editor.createState());

        // editor.setContent("c");

        // System.out.println(editor.getContent());

        // editor.restoreState(editorHistory.pop());
        // System.out.println(editor.getContent());

        // editor.restoreState(editorHistory.pop());
        // System.out.println(editor.getContent());
 
    }
}
