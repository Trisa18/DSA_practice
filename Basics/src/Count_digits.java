public class Count_digits {
    public static void main(String[] args) {
        int n=123467;
        System.out.println(count(n));
        System.out.println(count2(n));
    }
    static int count(int n){
        // time complextity O(log n)
        //space O(1)
        int c=0;
        while(n>0) {
            int rem = n % 10;
            c+=1;
            n=n/10;

        }
        return c;
    }

    static int count2(int n) {
        return (int)(Math.log10(n) + 1);
    }
}
