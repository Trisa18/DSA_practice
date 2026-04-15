public class Kadane_Algo {
    public static void main(String[] args) {
        int [] arr={2, 3, 5, -2, 7, -4};

        System.out.println(kadane(arr));

    }

    static int  kadane(int [] arr){
        int maxsum=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if(sum>maxsum)  maxsum=sum;

            if(sum<0) sum=0;

        }
        return maxsum;
    }
}
