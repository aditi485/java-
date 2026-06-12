public class shadowing {
     static int x =89;
    public static void main(String[] args) {
         System.out.println(x);
         int x = 4;// here the shadowing occur higher level scope is shadowed by the lower level
         System.out.println(x);
         num();
    }
    static void num(){
        System.out.println(x);
    }
}
