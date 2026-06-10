package assignments.lecture1;
// input the number print the multiplication table for it .
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no. u want to print");
        int num = in.nextInt();
        for(int i =1; i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }

        
        
    }
    
}
