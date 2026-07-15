package Day_6.Home_task;

import java.util.Scanner;

public class calculator_updated {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("add "+"subtract "+"multiply "+"divide "+"Exit ");



        while(true) {
            System.out.println("Enter the operation :");
            String op=sc.nextLine();
            if(op.equals("exit")){
                System.out.println("you were exited");
                break;
            }
            else {
                System.out.println("Enter the num1 :");
                int a = sc.nextInt();
                System.out.println("Enter the num2 :");
                int b = sc.nextInt();
                sc.nextLine();

                if (op.equals("add")) {
                    int result = a + b;
                    System.out.println("result: " + result);
                } else if (op.equals("subtract")) {
                    int result = a - b;
                    System.out.println("result: " + result);
                } else if (op.equals("multiply")) {
                    int result = a * b;
                    System.out.println("result: " + result);
                } else if (op.equals("divide")) {
                    int result = a / b;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("invalid operation");
                    break;
                }
            }
        }

    }
}