
import java.util.*;
//Take 2 numbers as input and print the largest number.
public class ques5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println("a is largest");
        }
        else{
            System.out.println("b is largest");
        }
    }
    
}