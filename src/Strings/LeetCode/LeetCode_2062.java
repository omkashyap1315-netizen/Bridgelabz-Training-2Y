package LeetCode;

public class LeetCode_2062 {

    public int countVowelSubstrings(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            int a = 0;
            int e = 0;
            int ii = 0;
            int o = 0;
            int u = 0;

            for (int j = i; j < word.length(); j++) {
                if (word.charAt(j) == 'a') {
                    a = 1;
                } else if (word.charAt(j) == 'e') {
                    e = 1;
                } else if (word.charAt(j) == 'i') {
                    ii = 1;
                } else if (word.charAt(j) == 'o') {
                    o = 1;
                } else if (word.charAt(j) == 'u') {
                    u = 1;
                } else {
                    break;
                }

                if (ii == 1 && e == 1 && o == 1 && a == 1 && u == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode_2062 solution = new LeetCode_2062();

        String[] testCases = {"aeiouu", "unicornarihan", "cuaieuouac"};

        for (String test : testCases) {
            System.out.println(test + " -> " + solution.countVowelSubstrings(test));
        }
    }
}