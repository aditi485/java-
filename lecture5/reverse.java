package lecture5;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] arr = {
            1,2,3,56,7,8
        };
        reverseArray(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr,int start,int end){
        
        for(int i=start;i<=end;i++){
           int temp = arr[i];
           arr[start]=arr[end];
           arr[end]=temp;
          end--;
          start++;
        }
    }
}
