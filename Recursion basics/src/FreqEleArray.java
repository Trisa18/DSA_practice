public class FreqEleArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 3, 1, 4};
        int n = arr.length;

        // Assume max element is 12
        int[] hash = new int[13];

        // Count frequency
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Print frequencies
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " appears " + hash[i] + " times");
            }
        }
    }
}