public class Atoi {

    public static void main(String[] args) {
        String s = " -12345";
        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int sign = 1, index = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        return (int)(sign * helper(s, index, 0));
    }

    static long helper(String s, int i, long result) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i)))
            return result;

        result = result * 10 + (s.charAt(i) - '0');

        // clamp
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return helper(s, i + 1, result);
    }
}