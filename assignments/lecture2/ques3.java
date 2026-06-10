import java.util.*;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principle");
        float p = in.nextFloat();
        System.out.println("enter the time");
        int t = in.nextInt();
        System.out.println("enter the rate");
        float r = in.nextFloat();
        float si =( p*r*t)/100;
        System.out.println("the simple interest : " + si);
        
    }



}