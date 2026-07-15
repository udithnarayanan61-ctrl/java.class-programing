package Day_10.Home_task;

import java.util.Arrays;
import java.util.Scanner;

public class parallel_array_modified {
    public static void main(String[] args){
        Drink d1=new Drink();
        d1.drinkDetails();
        d1.drinkDetails();
        d1.drinkDetails();
        d1.drinkDetails();
        d1.drinkDetails();

    }
}
class Drink {
    String[] drink_name = {"sprite", "maaza", "campa", "cola"};
    int[] price = {40, 50, 25, 40};
    int[] stock = {4, 5, 2, 8};
    int total = 0;
    int grandtotal = 0;

    Drink() {
        System.out.println(Arrays.toString(drink_name));
    }

    public void drinkDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the drink:");
        String name = sc.nextLine();
        System.out.println("Enter the quantity:");
        int qty = sc.nextInt();

        for (int i = 0; i < drink_name.length; i++) {
            if (name.equalsIgnoreCase(drink_name[i])) {
                if (qty > stock[i]) {
                    System.out.println("Insufficient Stocks");
                    System.out.println("Available stock is" + " " + stock[i]);

                } else {
                    total = qty * price[i];
                    stock[i] = stock[i] - qty;
                    System.out.println("Drink : " + drink_name[i]);
                    System.out.println("Price : " + price[i]);
                    System.out.println("Quantity :" + qty);
                    System.out.println("-------------------------------");
                    System.out.println("Total amount is " + total);
                    grandtotal += total;
                    System.out.println("Grand total amount is " + grandtotal);
                    System.out.println("-------------------------------");
                    if(name.equalsIgnoreCase("exit")){
                        System.out.println("Thank you");
                    }
                }

            }
        }
    }

}