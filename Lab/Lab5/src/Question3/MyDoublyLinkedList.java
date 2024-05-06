package Question3;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList<E> implements LinkedListInterface<E>{
    int size;
    Node<E> head;
    Node<E> tail;
    
    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node(element,head,null);
        if(size==0){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        head = newNode;
        size++;
        System.out.println("adding " + element);
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node(element, null, tail);
        if(size==0){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
        System.out.println("adding " + element);
    }

    @Override
    public void add(int index, E element) {
        if(index<0 || index>size)
            throw new IndexOutOfBoundsException();
        else if(index==0)
            addFirst(element);
        
        else if(index==size)
            addLast(element);
        
        else{
            Node<E> current = head;
            for(int i=0 ; i<index ; i++){
                current = current.next;
            }
            Node<E> newNode = new Node(element,current.next,current);
            current.next.previous = newNode;
            current.next = newNode;
            size++;
            System.out.println("adding " + element);
        }
    }

    @Override
    public E removeFirst() {
        if(size==0)
            throw new NoSuchElementException();
        Node<E> temp = head;
        head = head.next;
        head.previous = null;
        size--;
        System.out.println("removing " + temp.element);
        return temp.element;
    }

    @Override
    public E removeLast() {
        if(size==0)
            throw new NoSuchElementException();
        Node<E> temp = tail;
        tail = tail.previous;
        tail.next = null;
        size--;
        System.out.println("removing " + temp.element);
        return temp.element;
    }

    @Override
    public E remove(int index) {
        if(index<0 || index>size)
            throw new IndexOutOfBoundsException();
        else if(index==0)
            return removeFirst();
        else if(index==size)
            return removeLast();
        else{
            Node<E> current = head;
            for(int i=0 ; i<index ; i++){
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
            System.out.println("removing " + current.element);
            return current.element;
        }
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Clearnig the list");
    }
    
    public void iterateForward(){
        Node<E> current = head;
        
        System.out.println("Iterate forward");
        for(int i=0 ; i<size-1 ; i++){
            System.out.print(current.element + ", ");
            current = current.next;
        }
        System.out.println(current.element);
    }
    
    public void iterateBackward(){
        Node<E> current = tail;
        
        System.out.println("Iterate backward");
        for(int i=0 ; i<size-1 ; i++){
            System.out.print(current.element + ", ");
            current = current.previous;
        }
        System.out.println(current.element);
    }
}
