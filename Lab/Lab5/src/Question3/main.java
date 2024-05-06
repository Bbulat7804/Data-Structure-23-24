package Question3;

public class main {
    public static void main(String[] args) {
        MyDoublyLinkedList<Integer> list = new MyDoublyLinkedList();
        list.addFirst(1);
        list.addLast(100);
        list.add(2,2);
        list.remove(3);
        list.iterateForward();
        list.iterateBackward();
        System.out.println("Size = " + list.size);
        list.clear();
    }
}
