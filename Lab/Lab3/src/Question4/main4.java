package Question4;

public class main4 {
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        bag1.add("hazim");
        bag1.add("hazim");
        bag1.add("hazim");
        bag1.add("nazifah");
        bag1.add("xayne");
        bag1.add("xayne");
        
        bag2.add("nazifah");
        bag2.add("nazifah");
        bag2.add("hazim");
        bag2.add("xayne");
        bag2.add("hani");
        bag2.add("hani");
        bag2.add("xayne");
        
        ArrayBag<String> leftOver1 = (ArrayBag)bag1.difference(bag2);
        ArrayBag<String> leftOver2 = (ArrayBag)bag2.difference(bag1);
        
        Object[] arrayBag1 = bag1.toArray();
        Object[] arrayBag2 = bag2.toArray();
        
        System.out.println("Items in bag 1 : ");
        for(int i=0 ; i<arrayBag1.length ; i++){
            System.out.println((i+1) + ". " + arrayBag1[i]);
        }
        
        System.out.println("\nItems in bag 2 : ");
        for(int i=0 ; i<arrayBag2.length ; i++){
            System.out.println((i+1) + ". " + arrayBag2[i]);
        }
        
        System.out.println("\ndifference between bag 1 and bag 2 size: " + leftOver1.getCurrentSize());
        Object[] array1 = leftOver1.toArray();
        for(int i=0 ; i<array1.length ; i++){
            System.out.println((i+1) + ". " + array1[i]);
        }
        
        System.out.println("\ndifference between bag 2 and bag 1 size: " + leftOver2.getCurrentSize());
        Object[] array2 = leftOver2.toArray();
        for(int i=0 ; i<array2.length ; i++){
            System.out.println((i+1) + ". " + array2[i]);
        }
    }
}
