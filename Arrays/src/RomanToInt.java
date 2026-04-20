import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(convertToRoman(s));

        String s2= "MCMXCIV";
        System.out.println(convertToRoman(s2));

    }
    static int convertToRoman(String s){
        int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        //I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);



        for (int i = 0; i < s.length()-1; i++) {
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
                res-=map.get(s.charAt(i));
            else

                res+=map.get(s.charAt(i));




        }
        return res+map.get(s.charAt(s.length()-1));
    }
}
