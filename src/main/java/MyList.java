import java.util.*;

public class MyList<T> implements List<T>{
    private int countNode;
    private int size;
    private int size_prev=5;
    private Node first;
    private Node last;

    public MyList(){
        Node firstNode = new Node(new Object[5], null, null);
        first = firstNode;
        last = firstNode;
    }

    private static class Node {
        Object[] values;
        Node prev;
        Node next;

        public Node(Object[] values, Node prev, Node next) {
            this.values = values;
            this.prev = prev;
            this.next = next;
        }
    }

    public void addLast(T t){
        last.values[size - 5 * countNode] = t;
        size++;
        if (size - 5 * countNode > 4){
            countNode++;
            Node newNode = new Node(new Object[5], last, null);
            last.next = newNode;
            last = newNode;
        }
    }

    public void addFirst(T t){
        if (size_prev % 5 == 0){
            Node newNode = new Node(new Object[5], null, first);
            first.prev = newNode;
            first = newNode;

            first.values[4] = t;
        } else {
            first.values[4 - size_prev%5] = t;
        }
        size_prev++;
        size++;
    }

    public T get(int index) {
        Node currentNode = first;
        int firstIndex = 4 - (size_prev-1)%5;

        int res;
        for (int i =0; i < index; i++) {
            firstIndex++;
            if (firstIndex == 5) {
                currentNode = currentNode.next;
                firstIndex=0;
            }
        }

        res = firstIndex;
        return (T) currentNode.values[res];
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(Object o) {
        return false;
    }


    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            int nextIndex;
            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public T next() {
                T t = get(nextIndex);
                nextIndex++;
                return t;
            }
        };
        return iterator;
    }


    public Object[] toArray() {
        Object[] mass = new Object[size()];
        for (int i = 0; i < size(); i++) {
            mass[i] = get(i);
        }
        return mass;
    }


    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    public boolean add(T t) {
        addLast(t);
        return true;
    }


    public boolean remove(Object o) {
        remove(indexOf(o));
        if (indexOf(o) == -1) {
            return false;
        }
        return true;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(Collection<? extends T> c) {
        for (Object o: c) {
            addLast((T) o);
        }
        return true;
    }


    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        for (Object o: c) {
            remove(o);
        }
        return true;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public void clear() {
        first = new Node(new Object[5], null, null);
        last = first;
        size = 0;
        size_prev = 5;
        countNode = 0;
    }


    public T set(int index, T element) {
        return null;
    }


    public void add(int index, T element) {

    }


    public T remove(int index) {
        Object[] o = toArray();
        int oldSize = size();
        T value = get(index);
        clear();
        for (int i = 0; i < oldSize; i++){
            if (i != index){
                addLast((T) o[i]);
            }
        }
        return value;
    }


    public int indexOf(Object o) {
        for (int i = 0; i <  size(); i++) {
            if (o.equals(get(i))) {
                return i;
            }
        }
        return 1;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<T> listIterator() {
        return null;
    }


    public ListIterator<T> listIterator(int index) {
        return null;
    }


    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


}
