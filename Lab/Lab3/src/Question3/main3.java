package Question3;

public class main3 {
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
        
        ArrayBag<String> commonItems = (ArrayBag)bag1.intersection(bag2);
        
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
        
        System.out.println("\nintersection size: " + commonItems.getCurrentSize());
        Object[] array = commonItems.toArray();
        for(int i=0 ; i<array.length ; i++){
            System.out.println((i+1) + ". " + array[i]);
        }
        
        
    }
}
