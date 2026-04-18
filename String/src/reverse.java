public class reverse {
    public static void main(String[] args) {
        String s = "ABCDE";
        String b = "welcome to the jungle";

        System.out.println(reverse(s));
        System.out.println();

        System.out.println(reverse_words(b));

    }

    static String reverse(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;


        }
        return new String(arr);
    }

    static String reverse_words(String b) {
        String[] arr = b.split(" ");
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;


        }
        return String.join(" ",arr);

    }
}

