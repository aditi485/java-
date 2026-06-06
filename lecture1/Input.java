import java.util.*;
public class Input {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println(input.next());    //next() -> to take input string only one word
       System.out.println(input.nextInt()); //   // it takes integer value
       //System.out.println(input.nextLine());//it takes input as complete line
       
       
       String name = input.nextLine();
       System.out.println(name);
   
       
       int rollno = input.nextInt();
        System.out.println(rollno);

    }
    
}
