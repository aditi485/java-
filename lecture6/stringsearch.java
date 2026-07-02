

public class stringsearch {
    public static void main(String[] args) {
        String name = "Rahul";
        char ch ='p';
        System.out.println(stringlinaersearch( name , ch));

    }
    static boolean stringlinaersearch(String name , char c){
        if(name.length() == 0){
            return false;

        }
        for(int i =0;i<name.length();i++){
            if(c==name.charAt(i)){
                return true;
            }
        }
        return false;


    }
    
}
