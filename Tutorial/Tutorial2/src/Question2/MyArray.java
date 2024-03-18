package Question2;

public class MyArray {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"Jane","Tom","Bob"};
        Character[] arr3 = {'a','b','c'};
        
        MyArray.<Integer>listAll(arr1);
       
        MyArray.<String>listAll(arr2);
        
        MyArray.<Character>listAll(arr3);
    }
    
    static<T>void listAll(T[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
