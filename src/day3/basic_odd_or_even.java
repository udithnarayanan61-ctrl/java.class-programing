package day3;

import java.util.Scanner;

public class basic_odd_or_even {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int a= sc.nextInt();

        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        sc.close();
    }
}