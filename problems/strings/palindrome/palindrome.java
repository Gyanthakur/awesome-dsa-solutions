import java.util.*;

public class palindrome {
    public static boolean isAlnum(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !isAlnum(s.charAt(left))) left++;
            while (left < right && !isAlnum(s.charAt(right))) right--;
            if (left < right) {
                char a = Character.toLowerCase(s.charAt(left));
                char b = Character.toLowerCase(s.charAt(right));
                if (a != b) return false;
                left++; right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String, Boolean>> tests = Arrays.asList(
            new AbstractMap.SimpleEntry<>("A man, a plan, a canal: Panama", true),
            new AbstractMap.SimpleEntry<>("race a car", false),
            new AbstractMap.SimpleEntry<>("", true),
            new AbstractMap.SimpleEntry<>("0P", false),
            new AbstractMap.SimpleEntry<>("Able was I, ere I saw Elba", true)
        );

        for (var t : tests) {
            System.out.println("\"" + t.getKey() + "\" -> " + isPalindrome(t.getKey()) +
                               " (expected: " + t.getValue() + ")");
        }
    }
}
