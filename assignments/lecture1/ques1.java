package assignments.lecture1;
// input ayear and find whether it is leap year or not
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = in.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("it is leap year");
           }
        else{
            System.out.println("it is not a leap year");
          }
        }
    }

    

