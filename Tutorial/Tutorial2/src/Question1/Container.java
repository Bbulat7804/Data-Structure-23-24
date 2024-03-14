package Question1;

public class Container<T> {
    T t;
    Container(){
        
    }
    
    void initialize(T t){
        t = this.t;
    }
    
    T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<String> c1 = new Container<>();
        Container<Integer> c2 = new Container<>();
        c1.t = "java";
        c2.t = 50;
        
        System.out.println("c1 contains " + c1.t);
        System.out.println("c2 contains " + c2.t);
    }
}
