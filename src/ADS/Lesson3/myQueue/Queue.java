package ADS.Lesson3.myQueue;

public interface Queue<E> {

    boolean insert(E value);

    E remove();

    E peekHead();

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    boolean isFull();
}
