package Question2;

public class MyLinkedList <E extends Comparable>{
    private int size = 0;
    private Node<E> head;
    private Node<E> tail;
    
    public void add(E e){
        Node newNode = new Node(e);
        if(size==0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail=newNode;
        }
        size++;
    }
    
    public void removeElement(E e){
        Node<E> current = head;
        if(current.element.equals(e)){
            System.out.println("remove");
            head = current.next;
            size--;
            return;
        }
        for(int i=0 ; i<size-1 ; i++){
            if(current.next.element.equals(e)){
                System.out.println("remove");
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }
    
    
    public void printList(){
        Node<E> current = head;
        for(int i=0 ; i<size ; i++){
            if(i<size-1)
                System.out.print(current.element + ", ");
            else
                System.out.println(current.element + ".");
            current = current.next;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        Node<E> current  = head;
        for(int i=0 ; i<size ; i++){
            if(current.element.equals(e)){
                return true;
            }
        }
        return false;
    }
    
    public void replace(E e, E newE){
        Node<E> current  = head;
        for(int i=0 ; i<size ; i++){
            if(current.element.equals(e)){
                current.element = newE;
            }
            current = current.next;
        }
    }
}
