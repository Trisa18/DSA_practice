public class Largestodd {
    public static void main(String[] args) {
        String s=  "0214638";
        System.out.println(findlargest(s));

    }
    static String findlargest(String s){
        for (int i = s.length()-1; i >=0 ; i--) {
            char c=s.charAt(i);
            if((c-'0')%2==1) {
                String result = s.substring(0, i + 1);
                result=result.replaceFirst("^0+","");
                return result;

            }
        }
        return "";
    }
}
