public class QueueAsMyLinkedList<E> {
    MyLinkedList<E> theQueue;

    public QueueAsMyLinkedList() {
        theQueue = new MyLinkedList<>();
    }

    // Add to the end
    public void enqueue(E newElement) {
        theQueue.append(newElement);
    }

    // Remove from the front
    public E dequeue() {
        return theQueue.removeFirst(); // simpler than delete(getFirst())
    }

    // Check if empty
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    // Get queue size
    public int size() {
        return theQueue.size();
    }

    @Override
    public String toString() {
        return theQueue.toString();
    }
}

