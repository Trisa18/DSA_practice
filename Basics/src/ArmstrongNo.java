public class ArmstrongNo {

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int digits = count(n);
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, digits);
            n /= 10;
        }

        return sum == original;
    }

    static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}