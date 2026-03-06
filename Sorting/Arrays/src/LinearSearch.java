public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,4,6,8,9,3,34};
        int num=34;
        System.out.println(linSearch(arr,num));

    }
    static int linSearch(int [] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) return i;

        }
        return -1;
    }

}
