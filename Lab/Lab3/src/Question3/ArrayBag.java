package Question3;

public class ArrayBag<T> implements BagInterface{

    private int DEFAULT_CAPACITY = 25;
    private int numberOfEntries = 0;
    T[] bag;
    
    ArrayBag(){
        bag = (T[])new Object[DEFAULT_CAPACITY];
    }
    
    ArrayBag(int capacity){
        bag = (T[])new Object[capacity];
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        if (numberOfEntries == bag.length)
            return true;
        else
            return false;
    }

    @Override
    public boolean isEmpty() {
        if (numberOfEntries == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean add(Object newEntry) {
        if (isFull()){
            return false;
        }
        
        for(int i=0 ; i<bag.length ; i++){
            if(bag[i]==null){
                bag[i] = (T)newEntry;
                numberOfEntries++;
                break;
            }
        }
        return true;
    }

    @Override
    public Object remove() {
        Object removed = null;
        if (isEmpty());
        
        else {
            for(int i=0 ; i<bag.length ; i++){
                if(bag[i]!=null){
                    removed = bag[i];
                    bag[i] = null;
                    numberOfEntries--;
                    break;
                }
            }
        }
        return removed;
    }

    @Override
    public boolean remove(Object anEntry) {
        for(int i=0 ; i<bag.length ; i++){
            if(bag[i]!=null && bag[i].equals(anEntry)){
                bag[i] = null;
                numberOfEntries--;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for(int i=0 ; i<bag.length ; i++){
            bag[i] = null;
        }
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        int frequency = 0;
        for(int i=0 ; i<bag.length ; i++){
            if(bag[i]!=null && anEntry.equals(bag[i]))
                frequency++;
        }
        return frequency;
    }

    @Override
    public boolean contains(Object anEntry) {
        for(int i=0 ; i<bag.length ; i++){
            if(bag[i]!=null && bag[i].equals(anEntry))
                return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[numberOfEntries];
        
        int index = 0;
        for(int i=0 ; i<bag.length ; i++){
            if(bag[i]!=null)
                array[index++] = bag[i];
        }
        return array;
    }

    @Override
    public BagInterface intersection(BagInterface bag) {
        int size = this.getCurrentSize()<bag.getCurrentSize() ? this.getCurrentSize() : bag.getCurrentSize();
        BagInterface intersection = new ArrayBag(size);
        
        Object[] array = this.toArray();
        Object[] tempBag = bag.toArray();
        for(int i=0 ; i<array.length ; i++){
            int frequency = 0;
            frequency =this.getFrequencyOf(array[i])<bag.getFrequencyOf(array[i]) ? this.getFrequencyOf(array[i]) : bag.getFrequencyOf(array[i]);
            bag.remove(array[i]);
            
            for(int j=0 ; j<frequency ; j++)
                intersection.add(array[i]);
        }
        
        bag.clear();
        for(int i=0 ; i<tempBag.length ; i++)
            bag.add(tempBag[i]);
        return intersection;
    }

   
}
