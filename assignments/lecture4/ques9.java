//Write a program to print the factorial of a number by defining a method named 'Factorial'.
package assignments.lecture4;
import java.util.*;

public class ques9 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no. whose factorial you want to take");
        int num = in.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
     }
     static int factorial(int n){
        int multiply = 1;
        while(n>0){
            multiply=multiply*n;
            n=n-1; 
        }
        return multiply;
     }
    
}
