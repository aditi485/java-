//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered :
package assignments.lecture4;
import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your marks");
        int marks = in.nextInt();
        String ans = grade(marks);
        System.out.println(ans);


    }
    static String grade(int a){
        String result = "";
        if (a<=100&&a>90){
            result= "grade A";
        }
        if (a<=90&&a>80){
            result= "grade B";
        }
        if (a<=80&&a>70){
            result= "grade C";
        }
        if (a<=70&&a>60){
            result= "grade D";
        }
        if (a<=60&&a>50){
            result = "FAIL";
        }
        return result;
    }
    
}
