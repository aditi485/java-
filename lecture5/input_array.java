package lecture5;
import java.util.*;
public class input_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ; // this is called declaration of array
        // now how to take input in the array
        int[] arr1 = new int[7];
        arr1[0] = 5;
        arr1[1] = 56;
        arr1[2] = 71;
        System.out.println(Arrays.toString(arr1));
        System.out.println(" please enter the values . ");
        for(int i =0; i<arr1.length ;i++){
            arr1[i]=in.nextInt();
        }
        for(int i=0 ; i<arr1.length ; i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
