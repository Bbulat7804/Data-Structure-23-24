/*
Provide a declaration and implementation of the generic method
minmax() that takes in an array of generic type and returns a string
with the following format: Min = <minValue> Max = <maxValue>. For
instance, in your Q4main method, create one object of type array for
integers and one object of type string:

Integer[] intArray = {5,3,7,1,4,9,8,2};
String[] strArray = {"red", "blue", "orange", "tan"};
minmax() method returns “Min = 1 Max = 9” For intArray
minmax() method returns “Min = blue Max = tan” for strArray

*Hint: use Comparable interface to compare the values
*Hint: compareTo() method:

 if a > b, it returns positive number
 if a < b, it returns negative number
 if a == b, it returns 0 
*/

package Question4;


public class Q4main {
    public static <E extends Comparable> String minmax(E[] array){
        E min, max;
        min = array[0];
        max = array[0];
        
        for(int i=0 ; i<array.length ; i++){
            if(min.compareTo(array[i])>0)
                min = array[i];
            if(max.compareTo(array[i])<0)
                max = array[i];
        }
        
        return "Min = " + min + " Max = " + max;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
