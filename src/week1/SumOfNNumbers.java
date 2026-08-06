package week1;

import java.util.Scanner;

public class SumOfNNumbers {
    public static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;

        }
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
