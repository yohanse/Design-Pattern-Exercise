package composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component{
    private List<Component> teams = new ArrayList<>();
    private Truck truck;

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public void add(Component component){
        teams.add(component);
    }

    @Override
    public void render(int i){
        for(int j=0; j<i; j++){
            System.out.print("  ");
        }

        System.out.println("-Team");
        for(int j=-1; j<i; j++){
            System.out.print("  ");
        }
        truck.getName();
        for(Component component: teams)
            component.render(i + 1);
    }
}
