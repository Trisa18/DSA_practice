public class SecondSmallandLarge {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        if (arr.length < 2) {
            System.out.println("Second Largest: -1");
            System.out.println("Second Smallest: -1");
            return;
        }

        // Find actual max and min
        int maxVal = arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
            if (arr[i] < minVal) minVal = arr[i];
        }

        int seclargest = Integer.MIN_VALUE;
        int secsmallest = Integer.MAX_VALUE;

        // Find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > seclargest && arr[i] < maxVal) {
                seclargest = arr[i];
            }
        }

        // Find second smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secsmallest && arr[i] > minVal) {
                secsmallest = arr[i];
            }
        }

        // If no second largest/smallest exists, print -1
        if (seclargest == Integer.MIN_VALUE) seclargest = -1;
        if (secsmallest == Integer.MAX_VALUE) secsmallest = -1;

        System.out.println("Second Largest: " + seclargest);
        System.out.println("Second Smallest: " + secsmallest);
    }
}