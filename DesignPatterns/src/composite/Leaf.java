package composite;

public class Leaf implements Component {
    private String shapeName;

    public Leaf(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public void operation() {
        System.out.println(shapeName);
    }
    
}
