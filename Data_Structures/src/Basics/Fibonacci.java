package Basics;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int prev1 = 1;
        int prev2 = 0;

        for(int i = 0; i < n; i++) {
            if(i == 0 || i == 1) {
                System.out.println(i);
            } else {
                int curr = prev1+ prev2;
                System.out.println(curr);
                prev2 = prev1;
                prev1 = curr;
            }
        }
    }
}
