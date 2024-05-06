package Question3;

public interface LinkedListInterface<E>{
    public void addFirst(E element);
    public void addLast(E element);
    public void add(int index, E element);
    public E removeFirst();
    public E removeLast();
    public E remove(int index);
    public void clear();
}
