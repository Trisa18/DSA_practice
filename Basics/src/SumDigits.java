public class SumDigits {
    public static void main(String[] args) {
        int n=145;
        System.out.println(sumdigit(n));
    }
    static int sumdigit(int n){
        int sum=0;
        while(n>0) {
            int rem = n % 10;
            sum+=rem;
            n=n/10;

        }
        return sum;
    }
}
