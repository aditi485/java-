// Define a program to find out whether a given number is even or odd.
package assignments.lecture4;
import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        String ans = fun(num);
        System.out.println(ans);
    }
    static String fun(int a){
        String ans ;
        if(a%2==0){
             ans = "even";
        }
        else{
             ans = "odd";
        }
        return ans;

    }
    
}
