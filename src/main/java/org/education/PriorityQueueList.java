package org.education;

/**
 * Linked list-based implementation of a priority queue for House objects.
 */
public class PriorityQueueList implements PriorityQueue {
    private Node head;
    private int length;

    private static class Node {
        House house;
        Node next;

        Node(House house) {
            this.house = house;
            this.next = null;
        }
    }

    /**
     * Default constructor initializes an empty priority queue.
     */
    public PriorityQueueList() {
        this.head = null;
        this.length = 0;
    }

    /**
     * Copy constructor creates a deep copy of another PriorityQueueList.
     * @param other the PriorityQueueList to copy
     */
    public PriorityQueueList(PriorityQueueList other) {
        if (other.head == null) {
            this.head = null;
        } else {
            this.head = new Node(new House(other.head.house));
            Node current = this.head;
            Node otherCurrent = other.head.next;

            while (otherCurrent != null) {
                current.next = new Node(new House(otherCurrent.house));
                current = current.next;
                otherCurrent = otherCurrent.next;
            }
        }
        this.length = other.length;
    }

    /**
     * Adds a House object to the front of the priority queue.
     * @param a the House object to add
     */
    @Override
    public void add(House a) {
        Node newNode = new Node(a);
        newNode.next = head;
        head = newNode;
        length++;
    }

    /**
     * Retrieves and removes the house with the highest value.
     * @return the House object with the highest value, or null if the queue is empty
     */
    @Override
    public House getMostExpensive() {
        if (head == null) return null;

        Node current = head;
        Node mostExpensive = head;
        Node mostExpensivePrev = null;

        while (current.next != null) {
            if (current.next.house.getValue() > mostExpensive.house.getValue()) {
                mostExpensive = current.next;
                mostExpensivePrev = current;
            }
            current = current.next;
        }

        if (mostExpensivePrev == null) {
            head = head.next;
        } else {
            mostExpensivePrev.next = mostExpensive.next;
        }
        length--;
        return mostExpensive.house;
    }

    /**
     * Clears all houses from the priority queue.
     */
    @Override
    public void clear() {
        head = null;
        length = 0;
    }

    /**
     * Returns the number of houses in the priority queue.
     * @return the number of houses
     */
    @Override
    public int getLength() {
        return length;
    }

    /**
     * Checks if the priority queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     * Creates a deep copy of the current PriorityQueueList.
     * @return a new PriorityQueueList with the same houses
     */
    public PriorityQueueList deepCopy() {
        return new PriorityQueueList(this);
    }
}
