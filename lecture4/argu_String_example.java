public class argu_String_example {
    public static void main(String[] args) {
        String message = greet("aditi tripathi");
        System.out.println(message);

    }
    static String greet(String name){
        String greeting = "hello"+name;
        return greeting;
    }
}
