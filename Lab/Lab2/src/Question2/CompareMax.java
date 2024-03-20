package Question2;

public class CompareMax {
    static<E extends Comparable> E maximum(E a, E b, E c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if(b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    } 
    
    public static void main(String[] args) {
        Integer a = 0, b = 7, c = 11;
        
        System.out.println(CompareMax.<Integer>maximum(a, b, c));
    }
}
