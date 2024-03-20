package Question1;

public class MyGeneric<E>{
    E e;
    
    MyGeneric(){
        
    }
    
    MyGeneric(E e){
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("This is a String");
        MyGeneric<Integer> intObj = new MyGeneric<>(50);
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}