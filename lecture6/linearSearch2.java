
//In the case we have to search the element and return element for false case we can not return like that -1 boecz -1 can be element .
public class linearSearch2 {
   public static void main(String[] args) {
      int [] arr = {
        12,3,4,5,6,788,90
      };
      int target=78;
      int ans = linearSearch(arr,target);
      System.out.println(ans);
      
    
   } 
   static int linearSearch(int [] arr, int target){
      if(arr.length==0){
        return Integer.MAX_VALUE;
      }
      for(int i =0 ;i<arr.length;i++){
        if(arr[i]==target){
            return arr[i];
        }
      }
      return Integer.MAX_VALUE;
   }
}
