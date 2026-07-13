public class searchinrange {
    // for example you have given an  array [12,3,4,5,6,9,0,87,6,5] -> you have to search for 6 in range[2,5] that means you have to only search for indexes 2 to 5.
    public static void main(String[] args) {
       int[] arr ={1,7,6,89,45,67,78}; 
       int target=1;
       System.out.println(searching(arr,target,2,4));
    }
    static boolean searching(int[] arr,int target,int start,int end){
        for(int i=start;i<end;i++){
            if(arr[i]==target){
               return true;
            }
        }
        return false;
    }
}
