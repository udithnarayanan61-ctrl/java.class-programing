package day6.CLASS_TASK;

public class number_pattern {
    public static void main( String [] args){
        for (int i =1;i <=5; i++){
            for (int j =1 ; j<=i;  j++){ //12345
                System.out.print("\t"+ j);
            }
            System.out.println(); // takes to the next after the inner loop completely runs
        }
    }
}