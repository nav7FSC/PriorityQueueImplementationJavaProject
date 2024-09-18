# Priority Queue Implementation in Java

## Overview

This project implements a priority queue based on a linked list to manage and sort `House` objects by their value. The priority queue allows for adding houses, retrieving and removing the most expensive house, and testing various functionalities such as deep copying and queue length.

## Project Structure

- `src/main/java/org/education/`
    - `House.java`: Defines the `House` class with attributes for owner and value, including constructors, getters/setters, and methods for deep copying and equality checks.
    - `PriorityQueue.java`: Interface defining the priority queue operations.
    - `PriorityQueueList.java`: Implements the `PriorityQueue` interface using a custom linked list.
    - `Main.java`: The main class for executing the program, reading from an input file, populating the priority queue, and demonstrating various functionalities.
- `houses.txt`: The input file containing data for 1000 houses. Each house entry consists of an owner and a value on separate lines.
- `README.md`: This file.

## Features

- **Priority Queue Implementation**: A linked list-based priority queue for managing `House` objects.
- **Dynamic Data Handling**: Reads house data from an input file and populates the queue.
- **Data Retrieval**: Removes and displays houses in descending order of their value.
- **Copy and Deep Copy**: Demonstrates the use of copy constructors and deep copy methods.

## Usage

### Building and Running

1. **Ensure JDK 21+ is Installed**: This project requires JDK 21 or higher.

2. **Build the Project**:
    - Use Maven or your preferred build tool to compile the project.
    
3. **Run the Main Class**:
    - Execute the `Main` class to see the priority queue in action.

### Input File Format

- The `houses_input.txt` file should follow this format: 
- Each house entry consists of an owner and a value, with each pair of lines corresponding to a single house.

## Testing

The `Main` class performs the following tests:
- **Initialization**: Loads data from the `houses.txt` file and populates the priority queue.
- **Queue Operations**: Retrieves and removes houses in descending order of value.
- **Copy Operations**: Demonstrates the use of copy constructors and deep copy methods.
- **Queue Management**: Displays the queue length before and after removing all items.

## Author
Nav Singh [GitHub Profile](https://github.com/nav7FSC)

