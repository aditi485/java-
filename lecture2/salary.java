/* syntax of if 
    if(condition or boolean expression){
      //body
    }
   syntax of if else
   if(condition){
       //body
   }
   else{
       //body
   }

    only one block will be executed either if or else

*/

import java.util.*;
public class salary{ 
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("please enter the salary of employee:");
            int sal = in.nextInt();
            if(sal<=20000){
                System.out.println(sal = sal+1000);
            }
            if(sal<=30000){
                System.out.println( sal = sal+2000);
            }
            if(sal<40000){
                System.out.println(sal = sal+3000);
            }
            else{
                System.out.println(sal);
            }
           
        }
      
    
}
