package Question2;

public class MyArray<T> {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"Jane","Tom","Bob"};
        Character[] arr3 = {'a','b','c'};
        
        MyArray<Integer> integerArray = new MyArray<>();
        integerArray.listAll(arr1);
        
        MyArray<String> stringArray = new MyArray<>();
        stringArray.listAll(arr2);
        
        MyArray<Character> charArray = new MyArray<>();
        charArray.listAll(arr3);
    }
    
    void listAll(T[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
