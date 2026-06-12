// overloading -> means same function name but different arguments -> this can be done by various method ->by different no. of arguments , different types of argument.

public class over{
    public static void main(String[] args) {
        sum(2,3);
        sum(3, 04, 06);//function knows at compile time which function has to call.
    }
    static int sum (int a,int b ){
        return a+b;
    }
    static int sum (int a,int b,int c ){
        return a+b;
    }
    
}