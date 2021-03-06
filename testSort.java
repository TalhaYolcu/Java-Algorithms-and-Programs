import java.util.*;

import javax.swing.JOptionPane;

public class testSort {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter Array size:"));
        Integer[] items = new Integer[size]; // Array to sort.
        Integer[] copy = new Integer[size]; // Copy of array.
        Random rInt = new Random(); // For random number generation
        // Fill the array and copy with random Integers.
        for (int i = 0; i < items.length; i++) {
            items[i] = rInt.nextInt();
            copy[i] = items[i];
        }
        // Sort with utility method.
        long startTime = System.currentTimeMillis();
        Arrays.sort(items);
        System.out.println("Utility sort time is " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("Utility sort successful (true/false): " + verify(items));
        // Reload array items from array copy.
        for (int i = 0; i < items.length; i++) {
            items[i] = copy[i];
        }
        // Sort with quicksort.
        startTime = System.currentTimeMillis();
        QuickSort.sort(items);
        System.out.println("QuickSort time is " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("QuickSort successful (true/false): " + verify(items));
       // dumpTable(items); // Display part of the array.
    }
    /** Verifies that the elements in array test are
    in increasing order.
    @param test The array to verify
    @return true if the elements are in increasing order;
    false if any 2 elements are not in increasing order
    */
    private static boolean verify(Comparable[] test) {
        boolean ok = true;
        int i = 0;
        while (ok && i < test.length - 1) {
            ok = test[i].compareTo(test[i + 1]) <= 0;
            i++;
        }
        return ok;
    }
}
