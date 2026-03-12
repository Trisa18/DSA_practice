public class IsSorted {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,8};
        System.out.println(isSorted(arr));

    }
    static Boolean isSorted(int [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]) return false;

        }
        return true;
    }
}