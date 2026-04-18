public class String_Rotation {
    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";
        System.out.println(rotation(s, goal));
        System.out.println(optimised_rotation(s,goal));
    }

    static boolean rotation(String s, String goal) {
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            String rotate = s.substring(i) + s.substring(0, i);
            if (rotate.equals(goal)) return true;

        }
        return false;
    }

    static boolean optimised_rotation(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String doubled = s + s;
        return doubled.contains(goal);
    }
}

