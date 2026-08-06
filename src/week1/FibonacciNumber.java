package week1;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int n){
        int a=0;
        int b=1;
        int nextterm ;
        for(int i=2;i<n;i++){
            nextterm=a+b;
            a=b;
            b=nextterm;
        }
        return b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacciNumber(n));
    }
}
