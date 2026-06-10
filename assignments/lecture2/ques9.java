// To find Armstrong Number for a given number.
import java.util.*;
public class ques9 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("please enter the no.");
          int num = in.nextInt();
          int n1 = num;
          int rem;
          int sum = 0;
          while(num>0){
             rem = num%10;
             sum = sum + rem*rem*rem;
             num=num/10;
          }

          if(n1==sum){
            System.out.println("the given no. is armstrong");
          }
          else{
            System.out.println("not armstrong");
          }
        
    }
    
}
