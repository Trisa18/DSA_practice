import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(missing(arr));
        System.out.println(miss(arr));
        System.out.println(miss(arr2));

    }

    static int missing(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return arr.length+1;
    }

    static int miss(int [] arr){
        int n= arr.length+1;
        int total_sum=n*(n+1)/2;
        int sum_arr=0;
        for (int i = 0; i <arr.length ; i++) {
            sum_arr+=arr[i];


        }
        return total_sum-sum_arr;
    }
}

