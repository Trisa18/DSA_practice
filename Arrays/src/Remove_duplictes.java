
public class Remove_duplictes {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,2,3,3,3,4,4,5};
        int k=remove_duplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");

        }
    }


    static int remove_duplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }

        }
        return i + 1;
    }
}
