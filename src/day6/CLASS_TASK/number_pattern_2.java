package day6.CLASS_TASK;

public class number_pattern_2 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){//rows
            for(int j=1;j<=6-i;j++){//coloumn
                System.out.print(j);
            }
            System.out.println();
        }
    }
}