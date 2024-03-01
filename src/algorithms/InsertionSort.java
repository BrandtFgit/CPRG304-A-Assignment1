package algorithms;
import java.util.Comparator;

public class InsertionSort {
    public static <T> void sort(T[] arr, Comparator<T> comparator) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one index ahead
               of their current index */
            while (j >= 0 && comparator.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}