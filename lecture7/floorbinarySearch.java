package lecture7;

public class floorbinarySearch {
    public static void main(String[] args) {
        int[] arr = {
            2,45,56,78,90,98
        };
        int target = 55;
        int ans = floor(arr, target);
        System.out.println(ans);
        
    }
    static int floor(int[]arr,int target){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid==target){
                return arr[mid];
            }
            else if(target<mid){
                end = mid-1;
            }
            else if(target>mid){
                start = mid +1;
            }
        }
        return arr[end];
    }
    
}
