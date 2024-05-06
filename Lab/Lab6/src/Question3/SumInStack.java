package Question3;

import java.util.Stack;

public class SumInStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack();    
        stack.push(10);
        stack.push(8);
        stack.push(6);
        System.out.println(StackSum(stack));
    }
    
    public static int StackSum(MyStack<Integer> stack){
        int sum = 0;
        int size = stack.getSize();
        for(int i=0 ; i<size ; i++){
            sum+=stack.pop();
        }
        return sum;
    }
    
    
}
