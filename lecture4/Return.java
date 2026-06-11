import java.util.*;
public class Return {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number 1");
        int num = in.nextInt();
        System.out.println("please enter no. 2");
        int num1 = in.nextInt();
        int sum = num+num1;
        return sum ;// after return no code is going to be execute in a given function thus return is last statement

    }
    



}
