package Basics;

public class RotateANumber {
    public static void main(String[] args) {
        int num = 12345;
        int k = 2;

        int divisor = (int) Math.pow(10, k);

        int rem = num % divisor;
        int div = num / divisor;

        int numberOfDigits = count(div);
        int multiplier = (int) Math.pow(10, numberOfDigits);

        int answer = (rem * multiplier) + div;
        System.out.println(answer);
    }

    public static int count(int num) {
        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
