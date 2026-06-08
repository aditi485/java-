import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the temperature in celsius");
        int tempC = input.nextInt();

        float tempF = (tempC * 1.8f) + 32;
        System.out.println(tempF);
    }
    
}
