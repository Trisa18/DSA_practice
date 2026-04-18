import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    static  boolean isIsomorphic(String s,String t){
        if(s.length()!=t.length()) return false;
        int [] s1=new int[256];
        int [] t1=new int[256];
        for (int i = 0; i < s.length(); i++) {
            if(s1[s.charAt(i)]!=t1[t.charAt(i)]) return false;
            s1[s.charAt(i)]=i+1;
            t1[t.charAt(i)]=i+1;


        }
        return true;








        }
    }

