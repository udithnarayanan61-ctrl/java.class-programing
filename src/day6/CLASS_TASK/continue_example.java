package day6.CLASS_TASK;

public class continue_example {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}