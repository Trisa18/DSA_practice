public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 1, 1, 1};
        System.out.println(count(arr1));

        int[] arr2 = {1, 0, 1, 1, 0, 1};
        System.out.println(count(arr2));
    }

    static int count(int[] arr) {
        int maxc = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxc) {
                    maxc = count;
                }
            } else {
                count = 0;
            }
        }

        return maxc;
    }
}