import java.util.*;

public class valid_anagram {

    public static boolean isAnagram(String s, String t) {
        // Check length of source string vs target string. And check unique characters of source string vs target string.
        Set<Character> unique_chars_s = new HashSet<>();
        for (char c : s.toCharArray()) unique_chars_s.add(c);

        Set<Character> unique_chars_t = new HashSet<>();
        for (char c : t.toCharArray()) unique_chars_t.add(c);

        if (s.length() != t.length() && !unique_chars_s.equals(unique_chars_t))
            return false;

        // Check the count of each unique character in the source string against the count of the same character in the target string.
        for (char c : unique_chars_s) {
            int count_s = 0, count_t = 0;
            for (char ch : s.toCharArray()) if (ch == c) count_s++;
            for (char ch : t.toCharArray()) if (ch == c) count_t++;
            if (count_s != count_t) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String source = "aabc";
        String target = "baca";
        System.out.println(isAnagram(source, target));
    }
}
