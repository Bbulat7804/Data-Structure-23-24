package Question1;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        list.print();   
        list.reverse();
        System.out.println("The number of element in the list is : " + list.size);
        System.out.println("The first value is : " + list.getFirst());
        System.out.println("The last value is : " + list.getLast());
        list.remove(2);
        System.out.println("The second element : " + list.get(1));
        System.out.println("The third element : " + list.get(2));
        System.out.println("List contains c : " + list.contains("c"));
        list.set(0,"j");
        list.set(1,"a");
        list.set(2,"v");
        list.set(3,"a");
        list.addLast("a");
        list.print();
        System.out.println(list.size);
        System.out.println(list.getMiddleValue());
    }
}
