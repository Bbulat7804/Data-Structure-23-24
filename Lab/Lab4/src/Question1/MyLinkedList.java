package Question1;

public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;
    MyLinkedList(){
        
    }
    
    public void addFirst(E e){
        Node newHead = new Node(e);
        if(head == null){
            head = newHead;
        }
        else{
            newHead.next = head;
            head = newHead;
        }
        size++;
        if(tail == null){
            tail = head;
        }
    }
    public void addLast(E e){
        Node<E> newTail = new Node<>(e);
        if(tail == null){
            tail = newTail;
        }
        else{
            tail.next = newTail;
            tail = newTail;
        }
        size++;
            if(head == null){
                head = tail;
            }
    }
    public void add(int index, E e){
        if(index<1)
            addFirst(e);
        else if(index>=size){
            addLast(e);
        }
        else{
            Node<E> newNode = new Node<>(e);
            Node<E> current = head;
            for(int i=1 ; i<index ; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }
    public E removeFirst(){
        if(head == null){
            return null;
        }
        E temp = head.element;
        head = head.next;
        size--;
        return temp;
    }
    public E removeLast(){
        if(tail == null)
            return null;
        E temp = tail.element;
        Node<E> current = head;
        for(int i=0 ; i<size-2 ; i++){
            current = current.next;
        }
        tail = current;
        size--;
        return temp;
    }
    public E remove(int index){
        if(index<0 || index>=size)
            return null;
        else if(index == 0)
            return removeFirst();
        else if(index == size-1)
            return removeLast();
        else{
            Node<E> previous = head;
            for(int i=0 ; i<index-1 ; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    public boolean contains(E e){
        Node<E> current = head;
        for(int i=0 ; i<size-2 ; i++){
            if(current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }
    
    public E get(int index){
        Node<E> current = head;
        for(int i=0 ; i<index ; i++){
            current = current.next;
        }
        return current.element;
    }
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }

    public int indexOf(E e){
        for(int i=0 ; i<size-1 ; i++){
            if(get(i).equals(e))
                return i;
        }
        return -1;
    }
    public int lastIndexOf(E e){
        Node<E> current = tail;
        for(int i=size-1 ; i>=0 ; i++){
            if(get(i).equals(e))
                return i;
        }
        return -1;
    }
    public E set(int index, E e){
        Node<E> current = head;
        for(int i=0 ; i<index ; i++){
            current = current.next;
        }
        E temp = current.element;
        current.element = e;
        return temp;
    }
    
    public void clear(){
        head = null; 
        tail = null;
        size = 0;
    }
    
    public void print(){
        System.out.print("Linked list : ");
        for(int i=0 ; i<size ; i++){
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
    
    public void reverse(){
        System.out.print("Linked list in reverse: ");
        for(int i=size-1 ; i>=0 ; i--){
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
    
    public E getMiddleValue(){
        int middleIndex = (size-1)/2;
        Node<E> current = head;
        E middle;
        for(int i=0 ; i<middleIndex ; i++){
            current = current.next;
        }
        return current.element;
    }

}
