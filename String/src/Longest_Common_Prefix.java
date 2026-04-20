import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String [] str2={"apple", "banana", "grape", "mango"};
        System.out.println(commonPrefix(str));
        System.out.println(commonPrefix(str2));
    }

    static String commonPrefix(String[] str) {
        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        int i=0;
        if (str == null || str.length == 0) return "";
        while(i<s1.length()&&i<s2.length()) {
            if(s1.charAt(i)==s2.charAt(i))  i++;
            else
                break;


        }
        return s1.substring(0,i);
    }
}