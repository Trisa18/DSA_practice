public class NumTillN {
    public static void main(String[] args) {
        int n=7;
        numTilln(n);
        numTill1(n);

    }
    static void numTilln(int n){
        if(n<=0) return;
        numTilln(n-1);
        System.out.println(n);


    }
    static void numTill1(int n){
        if(n<=0) return;
        System.out.println(n);
        numTill1(n-1);

    }
}
