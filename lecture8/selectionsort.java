import java.util.Arrays;

import lecture5.arraylist;

public class selectionsort {
    public static void main(String[] args) {
        int arr [] = {5,3,4,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

static void selection(int[] arr){
    for(int i =0;i<arr.length;i++){
        int last = arr.length-i-1;
        int maxindex = maxSearch(arr,last);
        swap(arr, maxindex, last);
    }
}
static int maxSearch(int[] arr,int  last){
    int max =0;
    for(int i =0;i<=last;i++){
        if(arr[i]>arr[max]){
          max = i;

        }
    }
    return max;
}
static void swap(int[] arr , int first , int second){
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;

}
}