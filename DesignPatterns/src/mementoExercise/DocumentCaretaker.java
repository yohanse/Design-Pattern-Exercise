package mementoExercise;

import java.util.ArrayList;
import java.util.List;

public class DocumentCaretaker {
    List<DocumentMemento> history = new ArrayList<DocumentMemento>();

    public void push(DocumentMemento memento) {
        history.add(memento);
    }

    public DocumentMemento pop() {
        int lastIndex = history.size() - 1;
        DocumentMemento lastMemento = history.remove(lastIndex);
        return lastMemento;
    }
}
