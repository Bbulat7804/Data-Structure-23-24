package Question1;

public class main1 {
    public static void main(String[] args) {
        ArrayBag<Integer> bag = new ArrayBag<>();
        System.out.println(bag.getCurrentSize());
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(1);
        bag.add(1);
        bag.add(4);
        System.out.println("size = " + bag.getCurrentSize());
        bag.remove(3);
        System.out.println("size = " + bag.getCurrentSize());
        Object[] array = bag.toArray();
        for(int i=0 ; i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
