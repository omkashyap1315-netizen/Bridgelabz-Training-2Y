package week1;
import java.util.*;
public class ArmstrongNumber {
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean isArmstrongNumber(int n){
        int original = n;
        int sum=0;
        int d = count(n);
        while(n>0){
            int rem = n%10;
            sum = (int)(sum+Math.pow(rem,d));
            n=n/10;
        }
        if(sum==original){
            return true;
        }else{
            return false;
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrongNumber(n));
    }
}
