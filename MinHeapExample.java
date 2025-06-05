import java.util.*;

public class MinHeapExample {
    public static void main(String[] args) {
        // Creating a min-heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min-heap
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(3);

        // Printing and removing elements in ascending order
        System.out.println("Elements removed from Min Heap:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // poll() removes and returns the smallest element
        }
    }
}