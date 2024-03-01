package algorithms;
import java.util.Comparator;

public class QuickSort {
    public static <T> void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1, comparator);
    }

    private static <T> void quickSort(T[] arr, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int pi = partition(arr, low, high, comparator);

            quickSort(arr, low, pi - 1, comparator);
            quickSort(arr, pi + 1, high, comparator);
        }
    }

    private static <T> int partition(T[] arr, int low, int high, Comparator<T> comparator) {

        T pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (comparator.compare(arr[j], pivot) <= 0) {
                i++;

                // Swap arr[i] and arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high]
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
