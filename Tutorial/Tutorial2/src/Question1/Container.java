package Question1;

public class Container<T> {
    private T t;
    Container(){
        
    }
    
    void initialize(T t){
        this.t = t;
    }
    
    T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<String> c1 = new Container<>();
        Container<Integer> c2 = new Container<>();
        c1.initialize("java");
        c2.initialize(50);
        
        System.out.println("c1 contains " + c1.t);
        System.out.println("c2 contains " + c2.t);
    }
}
