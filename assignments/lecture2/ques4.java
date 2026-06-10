import java.util.*;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("enter hte operator +,-,/,*");
        String op = in.next();
        if(op.equals("+")){
            System.out.println(num1+num2);
        }
        else if(op.equals("-")){
            System.out.println(num1-num2);
        }
        else if(op.equals("*")){
            System.out.println(num1*num2);
        }
        else if(op.equals("/")){
            if(num2>0){
            System.out.println(num1/num2);}
            else{
                System.out.println("invalid");
            }
        }
        else{
            System.out.println("please enter the correct operator");
        }
    }
    
}
