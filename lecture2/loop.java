/* 
syntax of while loop
       while(condition){
          //body
        }

syntax of for loop
       for(initallisation;condition;increment){
       //body
       } 

syntax for do while loop
       do{
       //body
       }while(condition);

*/ 
// exapmle we have to print a number from 1 to 7
import java.util.*;

public class loop {
    public static void main(String[] args) {
        // using while loop
        int count = 1;
        while(count<=7){
            System.out.println(count);
            count++;
        }
        // using for loop
        for(int i=0 ; i<7; i++){
            System.out.println(i);
        }

        // using do-while loop
        int num = 1;
        do{
            System.out.println(num);
           num++;
        }while(num<7);

        
    }
    
}
