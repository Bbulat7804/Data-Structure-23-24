package Question2;

public class main2{
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        
        ArrayBag<String> everything = (ArrayBag)bag1.union(bag2);
        System.out.println("size of union bag: " + everything.getCurrentSize());
        
        Object[] array = everything.toArray();
        
        for(int i=0 ; i<array.length ; i++){
            System.out.println((i+1) + ". " + array[i]);
        }
        
        System.out.println("You removed b = " + everything.remove("b"));
        System.out.println("size of union bag: " + everything.getCurrentSize());
        
        array = everything.toArray();
        
        for(int i=0 ; i<array.length ; i++){
            System.out.println((i+1) + ". " + array[i]);
        }
    }
}
