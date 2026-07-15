package day6.CLASS_TASK;

public class schedule {
    public static void main(String[] args) {
        int daysCompleted =0;
        for(int month =1;month <=12;month++)
            for (int week = 1; week <= 4; week++) { //one month loop
                if (month ==2){continue;}
                for (int day = 1; day <= 7; day++) { // one week loop
                    System.out.println(  "month "+ month+" week" + week + " day " + day +  "days completed :"+ ++daysCompleted);
                    System.out.println(" come to college " +
                            "  study and go home   ");
                }
            }
    }
}