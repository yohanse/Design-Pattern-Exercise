package composite.exercise;

public class Truck {
    private String name;
    public Truck(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("-" + name);
    }
}
