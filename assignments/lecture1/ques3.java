package assignments.lecture1;

// Keep taking numbers as inputs till the user enters x, after that print sum of all.

import java.util.*;
public class ques3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number");
        int sum = 0;
        
      while(true){
        String n1 = in.next();
        if(n1.equals("x")){
             break;
        }
        else{
            int num = Integer.parseInt(n1);
            sum = sum + num;
        }
        
      }
      System.out.println(sum);
    }
}
