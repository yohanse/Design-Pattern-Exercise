package compositeExercise;

public class HumanResource implements Composite{

    @Override
    public void operation(int tabNum) {
        for(int i=0; i<tabNum; i++){
            System.out.print(" ");
        }
        System.out.println("+ Human Resource");
    }
    
}
