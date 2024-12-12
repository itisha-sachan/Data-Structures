package Basics;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        int n = 234587;
        int count = 0;

        while(n > 0) {
            int rem = n%10;
            count ++;
            int div = n / 10;
            n = div;
        }
        System.out.println(count);
    }
}
