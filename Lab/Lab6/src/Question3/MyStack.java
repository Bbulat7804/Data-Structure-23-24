package Question3;

import java.util.LinkedList;

public class MyStack<E> {
    LinkedList<E> stack = new LinkedList();
    public void push(E o){
        stack.add(o);
    }
    public E pop(){
        E temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return temp;
    }
    public E peek(){
        return stack.get(stack.size()-1);
    }
    public int getSize(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public String toString(){
        return "stack : " + stack;
    }
    public boolean search(E o){
        return stack.contains(o);
    }
}
