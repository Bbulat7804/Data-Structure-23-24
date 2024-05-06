package Question1;

public class SNode<E>{
    E element;
    SNode <E> next;
    SNode <E> previous;
    
    public SNode(){
        
    }
    
    public SNode(E element){
        this.element = element;
    }
}
