import java.util.ArrayList;

public class LeaderArray {
    public static void main(String[] args) {
        int [] arr={4,7,1,0};

        System.out.println(leader(arr));


    }

    static ArrayList<Integer> leader(int [] arr) {
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) li.add(arr[i]);
        }
        return li;
    }
}
