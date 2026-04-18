import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String a="rules";
        String b="lesrt";
        System.out.println(isAnagram(a,b));
        System.out.println( optimal_isAnagram(a,b));


    }
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        char [] a1=a.toCharArray();
        char [] b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1,b1);

    }

    static boolean optimal_isAnagram(String a,String b){
        a=a.replaceAll("\\s","").toLowerCase();
        b=b.replaceAll("\\s","").toLowerCase();

        if(a.length()!=b.length()) return false;
        int [] count= new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;


        }
        for(int c:count){
            if (c!=0) return false;
        }
        return true;


        }

}
