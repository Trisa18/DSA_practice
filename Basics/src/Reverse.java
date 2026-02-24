public class Reverse {
    public static void main(String[] args) {
        int n=143200;
        System.out.println(rev(n));
    }
    static int rev(int n){
        int reversed=0;
        while(n>0){
            int rem=n%10;

            reversed=reversed*10+rem;
            n=n/10;
        }
        return reversed;
    }
}
