import java.util.*;
// write a program to print whether the is even or odd
public class ques1 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       System.out.println("enter the number :");
       int num = in.nextInt();
       if(num%2==0){
         System.out.println("number is even");

       }
       else{
        System.out.println("numbetr is odd");
       }
   }
}