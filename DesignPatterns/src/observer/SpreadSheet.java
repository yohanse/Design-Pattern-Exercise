package observer;

import observer.framework.Observer;

public class SpreadSheet implements Observer{

    @Override
    public void update() {
        System.out.println("SpreadSheet got updated");
    }

}
