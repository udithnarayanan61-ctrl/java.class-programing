package day1.HOME_TASK;

public class largest_of_three_numbers {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("The largest is: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("The largest is: " + b);
        }
        else {
            System.out.println("The largest is: " + c);
        }
    }

}