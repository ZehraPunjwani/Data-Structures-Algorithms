package main.queue;

public class BasicQueue<X> {
    private final X[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (X[]) new Object[size];
    }

    public void enQueue(X item) {
        if ((end + 1) % data.length == front) {
            throw new IllegalStateException("The Queue is full");
        } else if (size() == 0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }
    }

    public X deQueue() {
        X item;
        if (size() == 0) {
            throw new IllegalStateException(("Can't deQueue because the queue is empty"));
        } else if (front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }

        return item;
    }

    public boolean contains(X item) {
        boolean found = false;
        if (size() == 0) {
            return found;
        }
        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }

        return found;
    }

    public X access(int position) {
        if (size() == 0 || position > size()) {
            throw new IllegalStateException("No item in the queue or position is greater then size");
        }
        int trueIndex = 0;
        for (int i = front; i < end; i++) {
            if (trueIndex == position) {
                return data[i];
            }
            trueIndex++;
        }
        throw new IllegalStateException("Could not get queue item at position: " + position);
    }

    public int size() {
        return front == -1 && end == -1 ? 0 : end - front + 1;
    }
}
