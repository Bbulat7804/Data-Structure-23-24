package Question2;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack();
        int input;
        System.out.println("Enter integers enter -1 to exit:   ");
        while(true){
            input = sc.nextInt();
            if(input==-1)
                break;
            stack.push(input);
        }
        System.out.println("Stack size = " + stack.getSize());
        for(int i=stack.getSize()-1 ; i>=0 ; i--){
            System.out.print(stack.pop() + " ");
        }
    }
}
