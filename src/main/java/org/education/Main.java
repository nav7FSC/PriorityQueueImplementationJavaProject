package org.education;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates the functionality of PriorityQueueList with House objects.
 */
public class Main {

    /**
     * Main method to run the program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        PriorityQueueList priorityQueue = new PriorityQueueList();
        String fileName = "houses.txt";

        // Load houses from file and add to the priority queue.
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String owner;
            String valueStr;
            while ((owner = reader.readLine()) != null && (valueStr = reader.readLine()) != null) {
                int value = Integer.parseInt(valueStr);
                House house = new House(owner, value);
                priorityQueue.add(house);
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
            return;
        }

        // Print houses in the original queue (highest value first).
        System.out.println("Houses in the original queue (highest value first):");
        PriorityQueueList tempQueue = new PriorityQueueList(priorityQueue); // Temporary queue to display houses
        while (!tempQueue.isEmpty()) {
            House house = tempQueue.getMostExpensive();
            System.out.println(house);
        }

        // Print the original queue length before clearing.
        System.out.println("Original queue length before clearing: " + priorityQueue.getLength());

        // Copy and deep copy the queue.
        PriorityQueueList copiedQueue = new PriorityQueueList(priorityQueue);
        PriorityQueueList deepCopiedQueue = priorityQueue.deepCopy();

        // Print lengths of copied and deep copied queues.
        System.out.println("The length of the copied Queue: " + copiedQueue.getLength());
        System.out.println("The Length of the Deep Copied Queue: " + deepCopiedQueue.getLength());

        // Clear the original queue.
        priorityQueue.clear();
        System.out.println("Original queue length after clearing: " + priorityQueue.getLength());
    }
}
