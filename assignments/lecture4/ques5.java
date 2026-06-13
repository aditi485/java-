package assignments.lecture4;

import java.util.*;

public class ques5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = multiply(a,b);
        System.out.println(ans);
    }
    static int multiply(int num1 , int num2){
        return num1 * num2;
    }
    
}
