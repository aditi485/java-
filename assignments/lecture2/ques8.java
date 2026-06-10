//To find out whether the given String is Palindrome or not.
// palindrome no. is a no. eg MAM whose reverse is also MAM
import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the string");
        String str = in.next();
        String rev = "";
        for(int i = str.length()-1 ; i>=0 ;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("the given string is palindrome");
        }
        else{
            System.out.println("the given string is not a palindrome");
        }
        
    }

    
}
