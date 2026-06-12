public class functional_scope {
    public static void main(String[] args) {
        int a=10;
        int b=14;
    }
    static void real(){
        int a = 15;// we can re declare the a here becoz of prior a scope is within the function.
        System.out.println(b);// this will give error becoz it cannot be acessed here

    }
}
