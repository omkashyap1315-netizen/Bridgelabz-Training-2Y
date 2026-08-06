package week1;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int n){
        int reversed = 0;
        while(n>0){
            int digit =n%10;
            reversed = reversed*10+digit;
            n=n/10;
        }
        return reversed;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
