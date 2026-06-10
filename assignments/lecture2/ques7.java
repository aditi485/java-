//To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class ques7 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many terms you want to print");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i =2;i<=num;i++){
            int temp = a + b;
            System.out.println(temp);
            a=b;
            b=temp;
        }

    }

    
}
