import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int []arr = {2,6,5,8,11};
        int s=14;
        System.out.println(twoSum(arr,s));
    }
    static  String twoSum(int [] arr, int s){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(s-arr[i]))  return "yes";
            set.add(arr[i]);
        }
        return "No";

    }
}
