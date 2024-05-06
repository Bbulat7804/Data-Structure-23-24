package Question1;

public class SList<E extends Comparable>{
    int size = 0;
    SNode<E> head;
    SNode<E> tail;
    
    public void appendEnd(E e){
        SNode<E> end = new SNode<>(e);
        if(size==0){
            head = end;
            tail = end;
        }
        else{
            tail.next = end;
            tail = end;
        }
        size++;
    }
    
    public E removeInitial(){
        if(head==null){
            return null;
        }
        else{
            SNode<E> remove = head;
            head = head.next;
            size--;
            return remove.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        for(int i=0 ; i<size ; i++){
            if(e.compareTo(current.element)==0){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void display(){
        SNode<E> current = head;
        for(int i=0 ; i<size ; i++){
            if(i<size-1)
                System.out.print(current.element + ", ");
            else
                System.out.println(current.element + ".");
                
            current = current.next;
        }
    }
}
