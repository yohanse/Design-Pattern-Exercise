package compositeExercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Composite {
    private String groupName;
    private List<Composite> objects = new ArrayList<Composite>();

    public Team(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void operation(int tabNum) {
        for(int i=0; i<tabNum; i++) {
            System.out.print(" ");
        }
        System.out.println("- " + groupName);
        for (Composite obj : objects) {
            obj.operation(tabNum + 2);
        }
    }
    
    public void add(Composite obj) {
        this.objects.add(obj);
    }
}
