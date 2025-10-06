import java.util.*;

public class find_all_anagrams_in_a_string {
    public static List<Integer> findAnagrams(String s, String t) {
        // Create a HashMap for target
        Map<Character, Integer> t_ctr = new HashMap<>();
        for (char c : t.toCharArray())
            t_ctr.put(c, t_ctr.getOrDefault(c, 0) + 1);

        List<Integer> res = new ArrayList<>();
        int lent = t.length();
        Map<Character, Integer> s_ctr = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // Add current char to window
            s_ctr.put(s.charAt(i), s_ctr.getOrDefault(s.charAt(i), 0) + 1);

            // Remove char that goes out of window
            if (i >= lent) {
                char old = s.charAt(i - lent);
                s_ctr.put(old, s_ctr.get(old) - 1);
                if (s_ctr.get(old) == 0)
                    s_ctr.remove(old);
            }

            // Compare both frequency maps
            if (s_ctr.equals(t_ctr))
                res.add(i + 1 - lent);
        }

        return res;
    }

    public static void main(String[] args) {
        String source = "cbaebabacd";
        String target = "abc";
        System.out.println(findAnagrams(source, target)); // [0, 6]

        source = "abab";
        target = "ab";
        System.out.println(findAnagrams(source, target)); // [0, 1, 2]
    }
}
