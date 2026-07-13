public class maxSearch {
    public static void main(String[] args) {
        int[] arr = {34,5,698,78,90,67};
          System.out.println(searchMax(arr));
    }
    static int searchMax(int[] arr){ 
        int max =0;
        if(arr.length==0){
            return max;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
    return max;
    }
}
