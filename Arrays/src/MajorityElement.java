public class MajorityElement {
    public static void main(String[] args) {
        int [] arr= {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(search(arr));
        System.out.println(majority(arr));

    }
    static int search(int [] arr){
        int n= arr.length;


        for (int i = 0; i < arr.length; i++) {
            int c=0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]==arr[j]) c+=1;
                if(c>n/2) return arr[i];

            }

        }
        return -1;
    }



    //Boyer-Moore (Optimal)
    static int majority(int[] arr) {
        int candidate = 0, count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // verify how many times candidate appears
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        return (count > arr.length / 2) ? candidate : -1;
    }
}
