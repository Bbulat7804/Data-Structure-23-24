package Question3;

public class StorePairGeneric <E extends Comparable> implements Comparable<StorePairGeneric>{

    private E first, second;

    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
    
    public void setPair(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object pair2){
        StorePairGeneric obj = (StorePairGeneric)pair2;
        return first.equals(obj.first); 
    }
    
    @Override
    public int compareTo(StorePairGeneric o) {
        return first.compareTo(o.first);
    }
    
    
    public static void main(String[] args) {
        StorePairGeneric<Integer> pair1 = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> pair2 = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> pair3 = new StorePairGeneric<>(6,3);
        
        System.out.println("Comparison pair 1 and pair 2 : " + pair1.compareTo(pair2));
        System.out.println("Comparison pair 2 and pair 3 : " + pair2.compareTo(pair3));
        System.out.println("Comparison pair 1 and pair 3 : " + pair1.compareTo(pair3));
        
        System.out.println("Check equality pair 1 and pair 2 : " + pair1.equals(pair2));
        System.out.println("Check equality pair 2 and pair 3 : " + pair2.equals(pair3));
        System.out.println("Check equality pair 1 and pair 3 : " + pair1.equals(pair3));
    }
    
}
