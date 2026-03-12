import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        String name="Sonu";
        int n=3;
        names(name,n);
    }
    static void names(String name,int n){
        if(n<=0) return;
        System.out.println(name);
        names(name,n-1);
    }
}
