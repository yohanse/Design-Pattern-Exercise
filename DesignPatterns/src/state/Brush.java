package state;

public class Brush implements Tool{

    @Override
    public void moveUp() {
        System.out.println("Brush move up");
    }

    @Override
    public void moveDown() {
        System.out.println("Brush move down");
    }

}
