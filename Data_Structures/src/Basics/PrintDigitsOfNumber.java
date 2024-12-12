package Basics;

public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        int n = 234500;
        int count = count(n);
        int i = count-1;

        int div = (int)Math.pow(10, count-1);
        while(div != 0) {
            int q = n/div;
            int r = n%div;
            System.out.println(q);
            n = r;
            div /=10;
        }
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
