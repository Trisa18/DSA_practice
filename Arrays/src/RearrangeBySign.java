import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int [] arr={1,2,-3,-1,-2,-3};
        rearrangement(arr);
        

    }
    static void rearrangement(int [] arr){
        int pos=0;
        int nev=1;
        int[] a=new int [arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>0){
                a[pos]=arr[i];
                pos+=2;
            }
            else{
                a[nev]=arr[i];
                nev+=2;
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }


}
