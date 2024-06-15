package state;

public class Selection implements Tool{

    @Override
    public void moveUp() {
        System.out.println("Selection move up");
    }

    @Override
    public void moveDown() {
        System.out.println("Selection move down");
    }

}
