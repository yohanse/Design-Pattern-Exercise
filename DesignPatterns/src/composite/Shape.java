package composite;

public class Shape implements Component {
    private String name;
    
    public Shape(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(name);
    }
    
}
