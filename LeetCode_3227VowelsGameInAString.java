public class LeetCode_3227VowelsGameInAString {
    public static void main(String[] args) {
        String s="leetcoder";
        boolean ans=doesAliceWin(s);
        System.out.println(ans);
    }
    public static boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u':
                    return true;
            }
        }
        return false;
    }
}
