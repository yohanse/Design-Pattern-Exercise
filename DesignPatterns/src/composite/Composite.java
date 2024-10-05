package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> objects = new ArrayList<Component>();

    @Override
    public void operation() {
        for(Component obj : objects) {
            obj.operation();
        }
    }

    public void add(Component obj) {
        objects.add(obj);
    }
    
}
