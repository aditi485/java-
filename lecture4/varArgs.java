import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
       fun(2,3,4,5,6,7); 
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    // it can also take multiples types of argument in the same fun
    static void funct(int a,int b, ...v){
        
    }

    
}
