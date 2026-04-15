public class Kadane_print {

    public static void main(String[] args) {
        int [] arr={2, 3, 5, -2, 7, -4};

        System.out.println(kadane(arr));

    }

    static int  kadane(int [] arr){
        int maxsum=arr[0];
        int sum=0;
        int s=0;
        int e=0;
        int temps =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];


            if(sum>maxsum)  {
                maxsum=sum;
                s= temps;
                e=i;
            }

            if(sum<0) {
                sum=0;
                temps =i+1;
            }

        }
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] +" ");


        }
        System.out.println();

        return maxsum;
    }
}
