package lecture5;
import java.util.*;
import java.util.ArrayList;

public class multiDarraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        //Initallisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3 ;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
    
}
