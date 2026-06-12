import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=99;// here original array gets change becoz it is modifiying the array not creating the new one
    }
    
}
