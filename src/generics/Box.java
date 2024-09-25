package generics;

/**
 Generic version of Box class.
 @param <T> is the type of the value being stored.
 */
public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
