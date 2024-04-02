package Question5;

public class ArrayBagDemo {
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        System.out.println("bag 1:");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);
        
        System.out.println("\n\nbag 2:");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);

        System.out.println("\n\nbag3, test the method union of bag1 and bag2:");
        ArrayBag<String> bag3 = (ArrayBag)bag1.union(bag2);
        displayBag(bag3);

        System.out.println("\n\nbag4, test the method intersection of bag1 and bag2:");
        ArrayBag<String> bag4 = (ArrayBag)bag1.intersection(bag2);
        displayBag(bag4);

        System.out.println("\n\nbag5, test the method difference of bag1 and bag2:");
        ArrayBag<String> bag5 = (ArrayBag)bag1.difference(bag2);
        displayBag(bag5);
        System.out.println("");
        
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for(int i=0 ; i<content.length ; i++){
            
            aBag.add(content[i] + " ");
        }
    }
    
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains" + aBag.getCurrentSize() + "string(s), as follows:");

        Object[] array = aBag.toArray();
        for(int i=0 ; i<aBag.getCurrentSize() ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
