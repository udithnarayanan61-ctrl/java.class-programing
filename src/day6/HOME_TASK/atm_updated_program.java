package Day_6.Home_task;

import java.math.BigDecimal;
import java.util.Scanner;

public class atm_updated_program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        String card = "yes";
        int cardid = 20242019;
        int cardpin = 2007;
        BigDecimal cardamount = new BigDecimal("1000");

        System.out.println("Insert The Card : ");
        String input =sc.nextLine();

        if(input.equals(card)){
            System.out.println("Enter your card number: ");
            int inputid = sc.nextInt();

            if(inputid==cardid){
                System.out.println("Enter your pin: ");
                int inputpin = sc.nextInt();

                if(inputpin == cardpin){
                    System.out.println("Enter the amount: ");
                    BigDecimal inputamount = sc.nextBigDecimal();
                    BigDecimal remainingbalance = cardamount.subtract(inputamount);
                    if(inputamount.compareTo(cardamount) <= 0){
                        System.out.println("The "+inputamount+" id withdraw");
                        System.out.println("Remaining balance :"+ remainingbalance);
                        System.out.println("Transaction is successfull");
                    }
                    else{
                        System.out.println(" * Insufficient Balance *");
                    }
                }
                else{
                    System.out.println(" * Incorrect Pin *");
                }
            }
            else{
                System.out.println(" * Incorrect Card ID *");
            }
        }
        else{
            System.out.println("* Card is not Inserted, please insert the card *");
        }
        sc.close();
    }
}