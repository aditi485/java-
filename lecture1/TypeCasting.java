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

       



    }
    
}
