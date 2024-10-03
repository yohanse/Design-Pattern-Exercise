import memnto.Orginator;
import memnto.Caretaker;

public class App {
    public static void main(String[] args) throws Exception {

        Caretaker caretaker = new Caretaker();

        Orginator orginator = new Orginator("a");

        caretaker.addState(orginator.createMemento());
        System.out.println(orginator.getContent());

        orginator.setContent("b");
        caretaker.addState(orginator.createMemento());
        System.out.println(orginator.getContent());

        orginator.setContent("c");
        // history.addState(editor.getState());
        System.out.println(orginator.getContent());

        orginator.setMemento(caretaker.removeState());
        System.out.println(orginator.getContent());

    }
}