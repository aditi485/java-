package lecture3;
/*
switch syntax 
     switch(expression){
         case value 1;
            //body
         break;   
       case value 2;
            //body
         break;   
       case value 3;
            //body
         break;  
      default:
     
     }

*/
import java.util.*;

public class Switch_basics {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the no.");
         
        int num = in.nextInt();
        switch(num){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");

            default:System.out.println("invalid");
        }

    }
    
}
