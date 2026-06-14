//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package assignments.lecture4;
import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextFloat();
        double ans = circumference(radius);
        System.out.println(ans);
        double ans1 = area(radius);
        System.out.println(ans1);

    }
    static double circumference(double a){
        return 2 * 3.14 * a;
    }
    static double area(double a){
        return 3.14*a*a;
    }
    
}
