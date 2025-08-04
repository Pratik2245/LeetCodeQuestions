import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_242ValidAnagrams {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean b=isAnagram(s,t);
        System.out.println(b);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] sf=new int[26];
        for (int i = 0; i < s.length(); i++) {
            sf[s.charAt(i)-'a']++;
            sf[t.charAt(i)-'a']--;
        }
        System.out.println(Arrays.toString(sf));

        for (int i = 0; i <26; i++) {
            if(sf[i]!=0){
                return false;
            }
        }
        return true;
    }
}
