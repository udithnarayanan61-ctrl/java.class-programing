
package day6.CLASS_TASK;

public class nested_for_example {
    public static void main(String args []){
        for (int i =1; i<=5 ;i++) { // outer loop
            for (int j=1 ; j<=5; j++) // inner loop
            {
                System.out.println(" outer : " +i +" inner : "+j );  // inner statement
            }
            System.out.println();
        }
        System.out.println("Exited from the for loop");
    }
}