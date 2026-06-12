import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = in.nextInt();
        System.out.println("enter the number");
        int num2 = in.nextInt();
        swapping(num1 ,num2);// here the num1 and num2 does not get change or swap becoz in primitive data type only pass by value occurs
       
    }
    static void swapping(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        
        
    }
    
}
