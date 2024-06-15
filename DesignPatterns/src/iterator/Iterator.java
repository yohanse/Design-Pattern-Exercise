package iterator;

public interface Iterator<T>{
    boolean hasNext();
    T currentState();
    void next();
}
