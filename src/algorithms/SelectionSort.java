package algorithms;
import java.util.Comparator;

public class SelectionSort {
    public static <T> void sort(T[] arr, Comparator<T> comparator) {
        int n = arr.length;
        
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(arr[j], arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
