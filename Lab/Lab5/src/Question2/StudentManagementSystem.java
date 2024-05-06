package Question2;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        MyLinkedList<String> list = new MyLinkedList(); 
        
        System.out.println("Enter you student nsme list. Enter \"n\" to end.....");
        
        while(true){
            input = sc.nextLine();
            if(input.compareToIgnoreCase("n")==0){
                break;
            }
            list.add(input);
        }
        
        System.out.println("You have entered the following students' name :");
        list.printList();   
        System.out.println("\nThe number of students entered is : " + list.getSize());
        System.out.println("\nAll the names entered are correct? Enter \'r\' to rename the student name, \'n\' to proceed.");
        do{
            input = sc.nextLine();
            if(input.compareToIgnoreCase("n")!=0 && input.compareToIgnoreCase("r")!=0){
                System.out.println("Invalid input enter \'n\' or \'r\' only!!");
            }
        }while(input.compareToIgnoreCase("n")!=0 && input.compareToIgnoreCase("r")!=0);
        
        if(input.compareToIgnoreCase("r")==0){
            String oldName,newName;
            
            System.out.println("\nEnter the existing student name that u want to rename :");
            oldName = sc.nextLine();
            
            System.out.println("\nEnter the new name :");
            newName = sc.nextLine();
            
            list.replace(oldName, newName);
            
            System.out.println("\nThe new student list is :");
            list.printList();
        }
        
        System.out.println("\nDo you want to remove any of your student name? Enter \'y\' for yes, \'n\' to proceed");
        do{
            input = sc.nextLine();
            if(input.compareToIgnoreCase("n")!=0 && input.compareToIgnoreCase("y")!=0){
                System.out.println("Invalid input enter \'n\' or \'y\' only!!");
            }
        }while(input.compareToIgnoreCase("n")!=0 && input.compareToIgnoreCase("y")!=0);
        
        if(input.compareToIgnoreCase("y")==0){
            String remove;
            
            System.out.println("\nEnter a student Name to remove");
            remove = sc.nextLine();
            list.removeElement(remove);
            System.out.println("\nThe number of updated student is :" + list.getSize());
            System.out.println("The updated student list is : ");
            list.printList();
        }
        
        System.out.println("\nAll student data captured complete. Thank you!");
    }
}
