package lecture5;

public class Array {
    /* what is array?
    -> array is a data structure used to store collection of similar datatypes .
    // syntax of Array
     data_types[] variable = new data_types[size];
          or
     data_types[] variable = {1,2,3,4,5}     
     */
    // int[] arr = new int[6]; // new -> is used to create object in a heap memory.
    // int[] arr1 = {1,2,3,4,5};
    public static void main(String[] args) {
        int[] rnos;
        rnos = new int[8];
        System.out.println(rnos[1]);//when u have not given values in the array then it will show you 0
    }
    
}
