import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args) {
      int [] arr = {5,1,3,2,4}; 
      bubble(arr); 
    }
    static void bubble(int[] arr){
        boolean swapp;
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            swapp = false;
            for(int j=1;j<=n-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    swapp =true;
                }

            }
            if(swapp==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}