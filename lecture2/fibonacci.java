import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter term u want to print of fibonacci series");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        
        for(int i =2;i<=n;i++){
            c = a+b ;
            a=b;
            b=c;

        }
         System.out.println(c);
    }
    
}
