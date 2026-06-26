package lecture5;
// questions
public class max {
    public static void main(String[] args) {
           int[] arr = {
                 1,52,37,88,50,78};
         int ans = max(arr); 
         System.out.println(ans);
    } 

    static int max(int[] arr){
        int max = 0 ;
        for(int i =0;i<arr.length;i++){
           if(arr[i]>max){
            max = arr[i];
           }
        }
    return max;
   }
}
