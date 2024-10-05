package compositeExercise;

public class Truck implements Composite {

    @Override
    public void operation(int tabNum) {
        for(int i=0; i < tabNum; i++){
            System.out.print(" ");
        }
       System.out.println("+ Truck");
    }
    
}
