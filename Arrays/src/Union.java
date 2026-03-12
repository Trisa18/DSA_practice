
import java.util.HashSet;

public class Union {
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        unionArr(arr1, arr2);
        System.out.println(set);

    }

    static void unionArr(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);

        }
    }
}













