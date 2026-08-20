package Strings.LeetCode;

public class LeetCode_1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        int index = 0;
        while (index < word1.length || index < word2.length) {
            if (index < word1.length) {
                s1 = s1 + word1[index];
            }
            if (index < word2.length) {
                s2 = s2 + word2[index];
            }
            index++;
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        LeetCode_1662 solution = new LeetCode_1662();

        String[][] word1Cases = {
                {"ab", "c"},
                {"a", "cb"},
                {"abc", "d", "defg"}
        };
        String[][] word2Cases = {
                {"a", "bc"},
                {"ab", "c"},
                {"abcddefg"}
        };

        for (int i = 0; i < word1Cases.length; i++) {
            System.out.println(java.util.Arrays.toString(word1Cases[i]) + " vs " +
                    java.util.Arrays.toString(word2Cases[i]) + " -> " +
                    solution.arrayStringsAreEqual(word1Cases[i], word2Cases[i]));
        }
    }
}
