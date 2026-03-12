public class MajorityElement {
    public static void main(String[] args) {
        int [] arr= {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(search(arr));

    }
    static int search(int [] arr){
        int n= arr.length/2;
        int max=arr[0];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]) c+=1;
                if(c>=n) max=arr[i];

            }

        }
        return max;
    }
}
