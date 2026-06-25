package lecture5;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // syntax 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(67);
        list.add(78);
        list.add(98);
        System.out.println(list.contains(67));
        list.set(1,90);
        list.add(4,57);

        System.out.println(list);
    }
    
}
