package Question4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String sentence, reverse = "";
        Scanner sc = new Scanner(System.in);
        MyStack<Character> stack = new MyStack();
        System.out.print("Enter a sentence that is not more than 15 characters : ");
        while(true){
            sentence = sc.nextLine();
            if(sentence.length()>15){
                System.out.println("You entered more than 15 characters");
                continue;
            }
            break;
        }
        for(int i=0 ; i<sentence.length() ; i++){
            stack.push(sentence.charAt(i));
        }
        while(!stack.isEmpty()){
            reverse += stack.pop();
        }
        System.out.println(sentence);
        System.out.println(reverse);
        if(sentence.compareToIgnoreCase(reverse)==0)
            System.out.println("The sentence is a palindrome");
        else
            System.out.println("The sentence is not a palindrome");
        
        
    }
    
}
