package Question3;

public class C {
    public static void main(String[] args) {
        B[] o = {new A(), new B()};
        
        System.out.println(o[0]);
        System.out.println(o[1]);
    }
}

class A extends B{
    @Override
    public String toString(){
        return "A";
    }
}

class B{
    @Override
    public String toString(){
        return "B";
    }
}