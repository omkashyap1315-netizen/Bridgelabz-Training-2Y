package Strings.LeetCode;

public class LeetCode_1528 {

    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        LeetCode_1528 solution = new LeetCode_1528();

        String[] strings = {"codeleet", "abc", "aiohn"};
        int[][] indicesList = {
                {4, 5, 6, 7, 0, 2, 1, 3},
                {0, 1, 2},
                {3, 1, 4, 2, 0}
        };

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + " -> " + solution.restoreString(strings[i], indicesList[i]));
        }
    }
}
