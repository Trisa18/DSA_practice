import java.util.Arrays;

public class Sort012s {
    public static void main(String[] args) {
        int [] arr={1, 0, 2, 1, 0};
        int [] arr2={1,0,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sort012(arr2);
        System.out.println(Arrays.toString(arr2));


    }
    static void sort(int [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }
    static void sort012(int [] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;

            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
