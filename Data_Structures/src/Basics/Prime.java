package Basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            if(isPrime(sc.nextInt())) {
                System.out.println("Is Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 0 || n==1) {
            return true;
        }
        boolean flag = true;
        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
