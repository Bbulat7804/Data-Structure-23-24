package Question3;

public class Node<E>{
    E element;
    Node<E> next;
    Node<E> previous;
    
    public Node(){
        
    }
    
    public Node(E e){
        element = e;
    }
    
    public Node(E e, Node<E> next, Node<E> previous){
        element = e;
        this.next = next;
        this.previous = previous;
    }
}
