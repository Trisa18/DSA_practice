public class Longest_Subarray {
    public static void main(String[] args) {
        int [] arr={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(longest(arr,k));

    }
    static int longest(int [] arr,int targetsum){
        int maxl=0;
        int sum=0;
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];


        while(sum>targetsum){
            sum-=arr[i];
            i++;
        }
        if(sum==targetsum){
            maxl=Math.max(maxl,j-i+1);
        }

        }
        return maxl;
    }
}
