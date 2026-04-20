public class Max_Nest_Depth {

    public static void main(String[] args) {
        String s= s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxNest(s));
    }


    static int maxNest(String s){
        int p=0;int ans=0;
        if (s == null || s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') p++;
            else if (s.charAt(i)==')')  {
                p--;

            }
            ans=Math.max(p,ans);

        }
        return ans;
    }
}
