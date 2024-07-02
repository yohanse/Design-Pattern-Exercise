package observer;

import observer.framework.Subject;

public class DataSource extends Subject{
    private int value = 0;

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }
}
