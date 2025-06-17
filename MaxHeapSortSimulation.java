import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxHeapSortSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a max heap using PriorityQueue with reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Take number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Insert elements into max heap
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            maxHeap.add(num);
        }

        // Remove and print elements in descending order (max heap behavior)
        System.out.println("Elements in descending order:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        sc.close();
    }
}

