package Strings.LeetCode;

public class LeetCode_2806 {

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = ((purchaseAmount + 5) / 10) * 10;
        return 100 - rounded;
    }

    public static void main(String[] args) {
        LeetCode_2806 solution = new LeetCode_2806();

        int[] testCases = {9, 15, 10, 0, 100, 4, 5};

        for (int test : testCases) {
            System.out.println(test + " -> " + solution.accountBalanceAfterPurchase(test));
        }
    }
}
