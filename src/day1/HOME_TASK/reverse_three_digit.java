package day1.HOME_TASK;

public class reverse_three_digit {
    public static void main(String[] args) {
        int num = 345;
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        int reverse = (100 * c) + (10 * b) + a;
        System.out.println("Original : " + num);
        System.out.println("Reversed : " + reverse);
    }
}