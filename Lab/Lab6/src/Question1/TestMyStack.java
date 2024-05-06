package Question1;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack1 = new MyStack();
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        System.out.println(stack1);
        System.out.println("Stack contains b : " + stack1.search('b'));
        System.out.println("Stack contains k : " + stack1.search('k'));
        
        MyStack<Integer> stack2 = new MyStack();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2);
        System.out.println("Stack contains 6 : " + stack2.search(6));
    }
}
