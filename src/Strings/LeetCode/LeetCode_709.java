package Strings.LeetCode;

public class LeetCode_709 {

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        LeetCode_709 solution = new LeetCode_709();

        String[] testCases = {"Hello", "here", "LOVELY"};

        for (String test : testCases) {
            System.out.println(test + " -> " + solution.toLowerCase(test));
        }
    }
}
