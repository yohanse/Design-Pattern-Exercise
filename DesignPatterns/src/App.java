import adapter.CarmelFilter;
import adapter.Image;
import adapter.ImageView;
import adapter.VivdFIlter;
import adapter.avaFilter.Carmel;
import adapter.exercise.EmailClient;
import command.AddCustomerCommand;
import command.CustomerService;
import command.framework.Button;
import composite.Group;
import composite.Shape;
import composite.exercise.Human;
import composite.exercise.Team;
import composite.exercise.Truck;
import decorator.CloudStream;
import decorator.CompressCloudStream;
import decorator.EncryptedCloudStream;
import iterator.History;
import iterator.Iterator;
import memento.Editor;
import memento.EditorHistory;
import observer.Chart;
import observer.DataSource;
import observer.SpreadSheet;
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

        // 4 Decorator Pattern
        var cloudStream = new CloudStream();
        var encryptStream = new EncryptedCloudStream(cloudStream);
        var compressStream = new CompressCloudStream(encryptStream);

        compressStream.write("Yohanse Mehabaw");

        // 3.1 exericse on Adapter Pattern
        var emailClient = new EmailClient();

        emailClient.downloadEmails();

        // // 3 Adapter Pattern
        // var image = new ImageView(new Image());
        // image.apply(new CarmelFilter(new Carmel()));



        // 2.1 Exercise Composite Pattern

        // var team = new Team();
        // var team1 = new Team();
        // var team2 = new Team();
        // var team3 = new Team();

        // team1.add(new Human("Yoahnse Mehabw"));
        // team1.add(new Human("John Mehabw"));
        // team1.setTruck(new Truck("Truck 1"));

        // team2.add(new Human("Ruth Assefa"));
        // team2.add(new Human("Haile Rambo"));
        // team2.setTruck(new Truck("Truck 2"));

        // team3.add(new Human("Gebrsha"));
        // team3.add(new Human("Yared Amare"));
        // team3.setTruck(new Truck("Truck 3"));

        // team.add(team1);
        // team.add(team2);
        // team.setTruck(new Truck("Truck 0"));
        
        // team2.add(team3);

        // team.render(0);

        // 2.1 Composite Pattern
        // var group = new Group();
        // var group1 = new Group();
        // var group2 = new Group();

        // var circle1 = new Shape("Circle - 1");
        // var circle2 = new Shape("Circle - 2");
        // var rectangle1 = new Shape("rectangle - 1");
        // var rectangle2 = new Shape("rectangle - 2");

        // group.add(group1);
        // group.add(group2);
        // group1.add(circle1);
        // group2.add(rectangle1);
        // group1.add(circle2);
        // group2.add(rectangle2);
        
        // group1.render();
        // System.out.println("---------------------------");
        // group2.render();
        // System.out.println("---------------------------");
        // group.render();

        // 7. Observer Pattern

        // var data = new DataSource();
        // var chart = new Chart();
        // var spreadSheet = new SpreadSheet();

        // data.attachObserver(chart);
        // data.attachObserver(spreadSheet);

        // data.setValue(10);


        // 6. Command Pattern
        // var customer = new CustomerService();
        // var addCustomerCommand = new AddCustomerCommand(customer);

        // var button = new Button(addCustomerCommand);

        // button.onClick();
        // button.onClick();


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