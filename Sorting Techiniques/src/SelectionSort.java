import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int maxIndex(int[] arr, int s, int e) {
        int maxIndex = s;

        for (int i = s + 1; i <= e; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int m = maxIndex(arr, 0, i);
            swap(arr, m, i);
        }
    }
}