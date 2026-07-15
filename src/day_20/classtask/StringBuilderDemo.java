package day_20.classtask;

public class StringBuilderDemo {

        public static void main(String[] args){

            String name = " nishanth";
            StringBuilder s = new StringBuilder(name);
            s.append(" Kumar");

            s = s.reverse();

            String str = s.toString();
            System.out.println(str);
            //----------------------
//        StringBuffer sb = new StringBuffer();


        }
    }




