import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(div(n));
    }

    static ArrayList<Integer> div(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {  // avoid duplicate for perfect squares
                    list.add(n / i);
                }
            }
        }

        return list;
    }
}