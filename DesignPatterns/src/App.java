import composite.Composite;
import composite.Leaf;
import compositeExercise.HumanResource;
import compositeExercise.Team;
import compositeExercise.Truck;
import memento.Caretaker;
import memento.Orginator;
import mementoExercise.Document;
import mementoExercise.DocumentCaretaker;

public class App {
    public static void main(String[] args) throws Exception {
        // 2. Composite Pattern Implementation

        // Leaf circle1 = new Leaf("Circle 1");
        // Leaf circle2 = new Leaf("Circle 2");
        // Leaf circle3 = new Leaf("Circle 3");


        // Leaf rectangle1 = new Leaf("Rectangle 1");
        // Leaf rectangle2 = new Leaf("Rectangle 2");
        // Leaf rectangle3 = new Leaf("Rectangle 3");


        // Composite rectangle = new Composite();
        // rectangle.add(rectangle1);
        // rectangle.add(rectangle2);
        // rectangle.add(rectangle3);

        // Composite circle = new Composite();
        // rectangle.add(circle1);
        // rectangle.add(circle2);
        // rectangle.add(circle3);


        // Composite group = new Composite();
        // group.add(rectangle);
        // group.add(circle);

        // group.operation();

        // Composite Pattern Exercise

        // Team subTeam1 = new Team("Sub Team 1");
        // Team subTeam2 = new Team("Sub Team 2");
        // Team team = new Team("Team");

        // team.add(subTeam1);
        // team.add(subTeam2);
        // team.add(new HumanResource());
        // team.add(new Truck());

        // subTeam1.add(new Truck());
        // subTeam2.add(new Truck());

        // subTeam1.add(new HumanResource());
        // subTeam1.add(new HumanResource());
        // subTeam2.add(new HumanResource());
        // subTeam2.add(new HumanResource());

        // team.operation(0);

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
        // DocumentCaretaker caretaker = new DocumentCaretaker();
        // Document document = new Document("Yohanse Mehabaw", "Sarif", 15);

        // caretaker.push(document.createMemento());
        // System.out.println(document);

        // document.setContent("John Mehabaw");
        // System.out.println(document);

        // document.setMemento(caretaker.pop());
        // System.out.println(document);
    }
}