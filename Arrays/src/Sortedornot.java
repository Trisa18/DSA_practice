public class Sortedornot {
    public static void main(String[] args) {
        int  arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr));

        int [] arr2 = {5,4,6,7,8};
        System.out.println(isSorted(arr2));

    }
    static boolean isSorted(int [] arr){
        if (arr.length <= 1) return true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]) return false;

        }
        return true;
    }
}
