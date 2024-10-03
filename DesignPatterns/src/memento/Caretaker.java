package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> history = new ArrayList<Memento>();

    public void addState(Memento state) {
        history.add(state);
    }

    public Memento removeState() {
        int lastIndex = history.size() - 1;
        return history.remove(lastIndex);
    }
}
