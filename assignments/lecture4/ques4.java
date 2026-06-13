// Write a program to print the sum of two numbers entered by user by defining your own method.
package assignments.lecture4;
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = sum(a,b);
        System.out.println(ans);
    }
    static int sum(int num1,int num2){
        return num1+num2;
    }
}
