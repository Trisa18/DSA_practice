public class PalindromeString {
    public static void main(String[] args) {
        String a="abcdcba";
        System.out.println(palind(a));
        System.out.println(isPalindrome(a.toCharArray(),0,a.length()-1));
    }

    //Time = O(n)
    //O(n) (array + stack)
    static Boolean isPalindrome(char[] arr, int s, int e){
        if (s >= e) return true;

        if (arr[s] != arr[e]) return false;

        return isPalindrome(arr, s + 1, e - 1);
    }

    //Time = O(n)
    //Space = O(n)(because of char[])
    static boolean palind(String a){
       char [] arr= a.toCharArray();
       int s=0;int e= arr.length-1;
       while(s<e){
           if(arr[s]!=arr[e]) return false;

               s++;
               e--;

           }


        return true;


    }


}

