import memento.Caretaker;
import memento.Orginator;
import mementoExercise.Document;
import mementoExercise.DocumentCaretaker;

public class App {
    public static void main(String[] args) throws Exception {
        // 1. Memenot Pattern Implementation

        // Caretaker caretaker = new Caretaker();

        // Orginator orginator = new Orginator("a");

        // caretaker.addState(orginator.createMemento());
        // System.out.println(orginator.getContent());

        // orginator.setContent("b");
        // caretaker.addState(orginator.createMemento());
        // System.out.println(orginator.getContent());

        // orginator.setContent("c");
        // System.out.println(orginator.getContent());

        // orginator.setMemento(caretaker.removeState());
        // System.out.println(orginator.getContent());


        // Memento Pattern Exercise
        DocumentCaretaker caretaker = new DocumentCaretaker();
        Document document = new Document("Yohanse Mehabaw", "Sarif", 15);

        caretaker.push(document.createMemento());
        System.out.println(document);

        document.setContent("John Mehabaw");
        System.out.println(document);

        document.setMemento(caretaker.pop());
        System.out.println(document);
    }
}