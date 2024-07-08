package composite.exercise;

public class Human implements Component{
    private String name;
    public Human(String name){
        this.name = name;
    }
    @Override
    public void render(int i) {
        for(int j=0; j<i; j++){
            System.out.print("  ");
        }
        System.out.println("-" + name);
    }
    
}
