public class Remove_Parenthesis {
    public static void main(String[] args) {


        String s1 = "((()))";
        System.out.println(remove_Paranth(s1));

        String s2="()(()())(())";
        System.out.println(remove_Paranth(s2));
    }

    static String remove_Paranth(String s){
        StringBuilder result=new StringBuilder();
        int level=0;
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i)=='('){
                level++;
                if(level>1) result.append(s.charAt(i));
            } else if (s.charAt(i)==')') {
                level--;
                if(level>0) result.append(s.charAt(i));

            }

        }
        return result.toString();
    }
}
