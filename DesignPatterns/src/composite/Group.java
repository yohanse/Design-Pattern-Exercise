package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private List<Component> shapes = new ArrayList<>();
    @Override
    public void render() {
        System.out.println("Group");
        for(Component component: shapes){
            component.render();
        }
    }

    public void add(Component component) {
        shapes.add(component);
    }
}
