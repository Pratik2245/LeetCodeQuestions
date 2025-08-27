public class LeetCode_2315CountAsterisks {
    public static void main(String[] args) {
        
    }
    public int countAsterisks(String s) {
        boolean in = false;
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '|') in = !in;
            else if(c == '*' && !in) count++;
        }
        return count;
    }
}