import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        // automatic type conversion or widening conversion
        Scanner intput = new Scanner(System.in);
        float num = intput.nextFloat(); // but here we give integer
        System.out.println(num);

        // narrowing conversion 
        int num1 = (int)(234.67f);
        System.out.println(num1); // this will give only 234 

       // automatic type promotion in java
       byte b = 50;
       byte c = 42;
       System.out.println(b*c);// here we know the maximum value that can store in this is 256 in byte data type but when we are performing the expression it is automatically converted to integer data type

       // for example
       byte h = 34;
       short s = 456;
       int i = 2;
       float g =34.6f;
       double d = 67.2;
       System.out.println((h*s)+"  "+(i*g)+"  "+(d/g));
       System.out.println((h*s)+(i*g)-(d/g));





    }
    
}
