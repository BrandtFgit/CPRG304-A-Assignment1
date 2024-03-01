package algorithms;
import java.util.Comparator;

public class MergeSort {
    public static <T> void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1, comparator);
    }

    private static <T> void mergeSort(T[] arr, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid, comparator);
            mergeSort(arr, mid + 1, right, comparator);

            // Merge the halves
            merge(arr, left, mid, right, comparator);
        }
    }

    @SuppressWarnings("unchecked")
	private static <T> void merge(T[] arr, int left, int mid, int right, Comparator<T> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        Object[] L = new Object[n1];
        Object[] R = new Object[n2];

        // Copy data to temporary arrays L[] and R[]
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (comparator.compare((T) L[i], (T) R[j]) <= 0) {
                arr[k] = (T) L[i];
                i++;
            } else {
                arr[k] = (T) R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = (T) L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = (T) R[j];
            j++;
            k++;
        }
    }
}