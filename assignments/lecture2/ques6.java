//Input currency in rupees and output in USD
import java . util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ruppess to convert");
        float ruppess = in.nextFloat();
        float usd = ruppess*0.010f;
        System.out.println(usd);

    }
}
