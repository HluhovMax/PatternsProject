package patterns.behavioral.iterator;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public interface ProfileIterator {
    public boolean hasNext();

    public Profile getNext();

    public void reset();
}
