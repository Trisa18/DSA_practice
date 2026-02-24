public class PalindromeNo {
    public static void main(String[] args) {
        int n=12321;
        int n2=123987;
        isPalindrome(n);
        isPalindrome(n2);

    }
    static void isPalindrome(int n){
        if  (n==rev(n)){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome");
        }
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
