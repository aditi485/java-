
public class internal_function {
    public static void main(String[] args) {
       String name = "kunal kushwaha";
       change(name);
       System.out.println(name);/*  here if we print it gives kunal kushwaha 
       for this we have to see the internal what is happening inside this 
       -> here when we call the change method only value of refrence variable is paased 
       */
       
    }
    static String change(String naam){
        naam = "rahul rana"; // here new object is created not the variable get change
        return naam;
    }
    
}
