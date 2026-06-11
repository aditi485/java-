/*
in java we call function as a method becoz function inside the class called as a method ,In java we define everything inside the class.
// DEFINITION OF JAVA
       access modifier return_type name(){
       //body
       return statement}

return type -> means what the value of particular function call going to have.
when function finishes its execution its function call is going to have some value.
this value is called its return type.
*/

import java.util.*;
public class Basics{
     public static void main(String[] args) {
      sum();
      sum();

     }
     static void sum(){// this method need to be static becoz it is call in static method
      Scanner in = new Scanner(System.in);
      System.out.println("please enter the no.");
      int num1 = in.nextInt();
      System.out.println("please enter the second no.");
      int num2 = in.nextInt();
      int sum = num1+num2;
      System.out.println(sum);// here we are just printing not returning the value thats why its return type void or null

     }
}

