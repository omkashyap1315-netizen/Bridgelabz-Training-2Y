package Strings.LeetCode;


public class LeetCode_1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LeetCode_1455 solution = new LeetCode_1455();

        String[][] testCases = {
                {"i love eating burger", "burg"},
                {"this problem is an easy problem", "pro"},
                {"i am tired", "you"}
        };

        for (String[] test : testCases) {
            String sentence = test[0];
            String searchWord = test[1];
            System.out.println(sentence + " | \"" + searchWord + "\" -> " +
                    solution.isPrefixOfWord(sentence, searchWord));
        }
    }
}
