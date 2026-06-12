public class block_scope {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        {
            // int a=20 ; -> this cannot be again intiallised here
            a = 60; // but this can be modified and this change the original value of a becoz we are modifiying not creating the new
            int c = 60;//cannot be updated outside.
            System.out.println(b);// b can be acess here
        }
        System.out.println(a);
        //System.out.println(c);// but c cannot be acess here.
    }
    
}
