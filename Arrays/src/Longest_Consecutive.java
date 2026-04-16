import java.util.Arrays;

public class Longest_Consecutive {
    public static void main(String[] args) {
        int [] arr={100, 4, 200, 1, 3, 2};
        System.out.println(longest(arr));

    }
    static int longest(int [] arr){
        Arrays.sort(arr);
        int c=1;
        int long_c=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]) continue;  //duplicates
            if(arr[i]==arr[i-1]+1) c++;
            else c=1;

            long_c=Math.max(long_c,c);
        }

        return long_c;

    }
}
