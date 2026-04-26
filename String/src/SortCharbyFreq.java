import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharbyFreq {

    public static void main(String[] args) {
        String s= s = "tree";
        sortFreq(s);
    }


    static void sortFreq(String s){
        HashMap <Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

            List < Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
            list.sort((a,b)->{
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue()-a.getValue();

                }
                return a.getKey()-b.getKey();
            });

            for(Map.Entry<Character,Integer> entry:list){
                System.out.println(entry.getKey()+"->"+ entry.getValue());

            }



    }
}
