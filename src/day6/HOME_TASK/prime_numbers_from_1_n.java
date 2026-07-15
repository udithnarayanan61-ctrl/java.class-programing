package Day_6.Home_task;

import java.util.Scanner;

public class prime_numbers_from_1_n {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int count=0;
        int num=2;

        while(count<n){
            int factor=0;

            for(int i=1;i<=num;i++){
                if(num%i==0){
                    factor++;
                }
            }
            if(factor==2){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }


    }
}