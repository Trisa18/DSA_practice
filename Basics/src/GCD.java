public class GCD {
    public static void main(String[] args) {
        int a=-12;
        int b=18;
        a = Math.abs(a);
        b = Math.abs(b);
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return  a;
    }
}
