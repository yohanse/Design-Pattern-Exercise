import command.AddCustomerCommand;
import command.CustomerService;
import command.framework.Button;
import iterator.History;
import iterator.Iterator;
import memento.Editor;
import memento.EditorHistory;
import state.Brush;
import state.Canvas;
import state.Selection;
import strategy.BlackAndWhiteFilter;
import strategy.HighContrastFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;
import strategy.PngCompressor;
import templete.AuditRecord;
import templete.GenerateReportTask;
import templete.TaskExecutor;
import templete.TransferMoneyTask;

public class App {
    public static void main(String[] args) throws Exception {
        // 6. Command Pattern

        var customer = new CustomerService();
        var addCustomerCommand = new AddCustomerCommand(customer);

        var button = new Button(addCustomerCommand);

        button.onClick();
        button.onClick();
        // 5. Templete Pattern
        
        // var auditRecord = new AuditRecord();

        // var task = new TaskExecutor(new GenerateReportTask(auditRecord));
        // task.execute();

        // task.setCurrentTask(new TransferMoneyTask(auditRecord));
        // task.execute();

        // 4. Strategy Pattern
        // var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        // imageStorage.store();

        // imageStorage.setCompressor(new PngCompressor());
        // imageStorage.setFilter(new HighContrastFilter());
        // imageStorage.store();


        //3. Iterator Pattern
        // var browserHistory = new History<String>();
        // browserHistory.push("a");
        // browserHistory.push("b");
        // browserHistory.push("c");
        // browserHistory.push("d");

        // Iterator<String> browseHistoryIterator = browserHistory.createIterator();

        // while(browseHistoryIterator.hasNext()){
        //     System.out.println(browseHistoryIterator.currentState());
        //     browseHistoryIterator.next();
        // }

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