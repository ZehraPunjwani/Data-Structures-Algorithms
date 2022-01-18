package main.stack;

public class BasicStackImpl<X> {

    private final X[] data;
    private int size;

    public BasicStackImpl() {
        data = (X[]) new Object[1000];
        size = 0;
    }

    public void push(X newItem) {
        data[size++] = newItem;
    }

    public X pop() {
        if (size == 0) {
            throw new IllegalMonitorStateException("No more items on the stack");
        }
        return data[--size];
    }

    public boolean contains(X item) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }

        return found;
    }

    public X access(X item) {
        while (size > 0) {
            X tmpItem = pop();
            if (item.equals(tmpItem)) {
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find item on the stack " + item);
    }

    public int size() {
        return size;
    }
}
