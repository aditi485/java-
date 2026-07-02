

public class linearSearch {
    public static void main(String[] args) {
        int [] nums = {23,4,5,6,778,90,234};
        int target = 54;
        int ans = linearsearchingprogram(nums,target);
        System.out.println(ans);
    }
    

static int linearsearchingprogram(int[]arr, int target){
    if(arr.length == 0){
        return -1;
    }
    for(int index = 0 ;index<arr.length;index++){
        if(arr[index]==target){
            return index;
        }
    }
    return -1;
}
}

