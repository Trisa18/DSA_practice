import java.util.Arrays;

public class MoveZeoesEnd {
    public static void main(String[] args) {
        int [] arr={1,3,0,3,2,0,4};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void moveZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;

            }
        }
    }
}
