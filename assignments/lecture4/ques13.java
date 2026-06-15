//Write a function that returns the sum of first n natural numbers.
package assignments.lecture4;
import java.util.*;
public class ques13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = in.nextInt();
        int ans = sum(num);
        System.out.println(ans);

    }
    static int sum(int n){
        int add = 0;
        while(n>0){
            add=add+n;
            n=n-1;
        }
        return add;
    }
    
}
