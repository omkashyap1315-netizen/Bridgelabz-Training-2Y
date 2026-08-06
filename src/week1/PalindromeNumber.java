package week1;
import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindromeNumber(int n){
        int orignal=n;
        int reverse=0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        if(reverse==orignal){
            return true;
        }
        else{
            return false;
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindromeNumber(n));
    }
}
