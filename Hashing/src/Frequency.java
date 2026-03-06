import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " appears " + map.get(key) + " times");
        }
    }
}