package iterator;

import java.util.ArrayList;
import java.util.List;

public class History<T> {
    private List<T> history = new ArrayList<>();

    public T pop(){
        int lastIndex = history.size() - 1;
        T lastHistory = history.get(lastIndex);
        history.remove(lastIndex);
        return lastHistory;
    }

    public void push(T newHistory) {
        history.add(newHistory);
    }

    public ListIterator createIterator(){
        return new ListIterator(this);
    }
    
    public class ListIterator implements Iterator<T> {

        private History<T> history;
        private int index = 0;

        public ListIterator(History<T> history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.history.size());
        }

        @Override
        public T currentState() {
            return history.history.get(index);
        }

        @Override
        public void next() {
            index += 1;
        }
        
    }
}
