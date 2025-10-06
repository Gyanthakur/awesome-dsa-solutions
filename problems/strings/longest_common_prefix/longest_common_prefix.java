import java.util.*;

public class longest_common_prefix  {
    public static String longestCommonPrefix(String[] strs) {

        // Input: ["flower","flow","flight"]
        // Output: "fl"

        // flower       flow        flight
        //  0  i         j  i        j  i
        // [0][0] - f = [1][0] - f, [2][0] - f
        // [0][1] - l = [1][1] - l, [2][1] - l
        // [0][2] - o = [1][2] - o, [2][2] - o
        // [0][3] - w = [1][3] - w, [2][3] - w

        String res = "";

        // Find the minimum length string
        int minLen = strs[0].length();
        for (int k = 1; k < strs.length; k++) {
            minLen = Math.min(minLen, strs[k].length());
        }

        for (int i = 0; i < minLen; i++) {
            boolean allSame = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    allSame = false;
                    break;
                }
            }
            if (allSame)
                res += strs[0].charAt(i);
            else
                return res;
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
