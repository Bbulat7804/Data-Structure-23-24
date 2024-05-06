package Question1;

import java.util.Arrays;

public class ArrayBag<T> implements BagInterface<T>{
  private static final int DEFAULT_CAPACITY = 25; // Default capacity of the bag
    private T[] bag; // Array to store the bag items
    private int numberOfEntries; // Current number of items in the bag

    // Default constructor initializes the bag with default capacity
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    // Constructor initializes the bag with a given capacity
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        bag = tempBag;
        numberOfEntries = 0;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull()) {
            return false;
        }
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T removedItem = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null; // Dereference the removed item
        numberOfEntries--;
        return removedItem;
    }

    @Override
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index == -1) {
            return false;
        }
        bag[index] = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null; // Dereference the last item
        numberOfEntries--;
        return true;
    }

    @Override
    public void clear() {
        Arrays.fill(bag, null); // Dereference all items in the bag
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        return getIndexOf(anEntry) != -1;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for(int i=0 ; i<numberOfEntries ; i++){
            result[i] = bag[i];
        }
        return result;
    }

    // Helper method to get the index of an entry in the bag
    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
                return i;
            }
        }
        return -1; // Entry not found
    }
   
}
