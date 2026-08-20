package Strings.LeetCode;

public class LeetCode_387 {

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode_387 solution = new LeetCode_387();

        String[] testCases = {"leetcode", "loveleetcode", "aabb"};

        for (String test : testCases) {
            System.out.println(test + " -> " + solution.firstUniqChar(test));
        }
    }
}
