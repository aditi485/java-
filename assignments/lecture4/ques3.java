// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package assignments.lecture4;
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the age");
        int age = in.nextInt();
        String ans = funct(age);
        System.out.println(ans);


    }
    static String funct(int age){
        String checker;
        if(age>=18){
            checker ="can vote";

        }
        else {
            checker = "cannot vote";
        }
        return checker;

    }
    
}
