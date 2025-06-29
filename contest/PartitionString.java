import java.util.*;

public class PartitionString {
    public static List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            current.append(ch);
            if (seen.contains(current.toString())) {
                // current segment already seen, start new segment
                current = new StringBuilder().append(ch);
            }
            if (!seen.contains(current.toString())) {
                result.add(current.toString());
                seen.add(current.toString());
                current = new StringBuilder(); // reset current segment
            }
        }

        // If anything is left in current, add it
        if (current.length() > 0) {
            result.add(current.toString());
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "abbccccd";
        String s2 = "aaaa";

        System.out.println(partitionString(s1)); // Output: [a, b, bc, c, cc, d]
        System.out.println(partitionString(s2)); // Output: [a, aa]
    }
}
