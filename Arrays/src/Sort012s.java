import java.util.Arrays;

public class Sort012s {
    public static void main(String[] args) {
        int [] arr={1, 0, 2, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);

            }

        }
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
