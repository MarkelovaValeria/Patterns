package patterns.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    PlayerIt next();
    void reset();

}
