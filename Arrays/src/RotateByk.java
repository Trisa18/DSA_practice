import java.util.Arrays;

public class RotateByk {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int [] arr2={1,2,3,4,5,6,7};
        int k=2;

        rotate(arr,k,"right");
        System.out.println(Arrays.toString(arr));

        rotate(arr2,k,"left");
        System.out.println(Arrays.toString(arr2));
    }

    static void rotate(int [] arr,int k,String dir){

        k = k % arr.length;

        if ("right".equals(dir)) {

            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);

        } else if ("left".equals(dir)) {

            reverse(arr,0,k-1);
            reverse(arr,k, arr.length-1);
            reverse(arr,0, arr.length-1);
        }
    }

    static void reverse(int[] arr, int left, int right) {

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}