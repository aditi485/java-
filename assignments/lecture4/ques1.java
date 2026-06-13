// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package assignments.lecture4;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the three no.");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ans = max(a,b,c);
        System.out.println(ans);
    }
    static int max(int num1,int num2,int num3){
        int largest = num1;
        if(num2 > largest){
             largest = num2;
        }
        if(num3 > largest){
            largest = num3;
        }
        return largest;
    }

    
    
}
