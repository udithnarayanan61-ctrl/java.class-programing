package day8.CLASS_TASK;

import java.util.Scanner;

public class user_id_and_password {
    public static void main(String[] args) {
        String userId = "Sandy@123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user id : ");
        String InputId = sc.nextLine();
        if (InputId.equals(userId)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Enter correct user id");
        }

    }
}