package Question2;

public class Person {
    public Person(){
        System.out.println("(1) perform person's tasks");
    }
}

class Employee extends Person{

    public Employee() {
        this("(2) Invoke Employees's overloaded constructor");
        System.out.println("(3) performs Employees's tasks");
    }
    
    public Employee(String s){
        System.out.println(s);
    }
    
}

class Faculty extends Employee{
    public Faculty(){
        System.out.println("Performs Faculty's tasks");
    }
    
    public static void main(String[] args) {
        new Faculty();
    }
}

