package org.education;

/**
 * Interface for a PriorityQueue of House objects.
 */
public interface PriorityQueue {
    void add(House a);
    House getMostExpensive();
    void clear();
    int getLength();
    boolean isEmpty();
}
