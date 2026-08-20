package Strings.LeetCode;

public class LeetCode_171 {

    public int titleToNumber(String col) {
        int sum = 0;
        int p = 0;

        int n = col.length();

        for (int i = n - 1; i >= 0; i--) {
            int temp = col.charAt(i) - 64;
            sum = sum + (int) Math.pow(26, p++) * temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        LeetCode_171 solution = new LeetCode_171();

        String[] testCases = {"A", "AB", "ZY", "FXSHRXW"};

        for (String test : testCases) {
            System.out.println(test + " -> " + solution.titleToNumber(test));
        }
    }
}
