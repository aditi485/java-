package lecture5;
import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];// it is necessary to declare row size but column size can be or cannot be declared
        for(int row = 0;row< arr.length;row++){
            for(int col =0; col< arr[row].length;col++){
                 arr[row][col]=in.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
