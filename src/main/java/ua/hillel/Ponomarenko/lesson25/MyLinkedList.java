package ua.hillel.Ponomarenko.lesson25;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
    private int size = 0;
    private Node<E> head;
    private Node<E> tail;

    @Override
    public String toString() {
        String str = "";
        Iterator iterator = iterator();
        while(iterator.hasNext()){
            str = str + iterator.next()+" ";
        }
        return "MyLinkedList: " + str;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Node<E> i = head; i != null; i = i.next) {
            if (i.value.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> index = head;
            @Override
            public boolean hasNext() {
                return index!=null;
            }

            @Override
            public E next() {
                E result = index.value;
                index = index.next;
                return result;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] objArray = new Object[size()];
        int index = 0;
        for (Node<E> i = head; i != null; i = i.next) {
            objArray[index] = i.value;
            index++;
        }
        return objArray;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean add(E e) {
        Node<E> last = tail;
        Node<E> newNode = new Node<>(last, e, null);
        tail = newNode;
        if (last == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int count = 0;
        for (Node<E> i = head; i != null; i = i.next) {
            if (i.value.equals(o)) {
                if (i.prev == null) {
                    head = i.next;
                    i.next.prev = null;
                }
                if (i.next == null) {
                    tail = i.prev;
                    i.prev.next = null;
                }
                if (i.prev != null && i.next != null) {
                    i.prev.next = i.next;
                    i.next.prev = i.prev;
                }
                count++;
                size--;
                break;
            }
        }
        return count > 0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        int count = 0;
        for (Object o : c.toArray()) {
            if (contains(o)) {
                count++;
            }
        }
        return count == c.size();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (Object e : c.toArray()) {
            add((E) e);
        }
        return c.size() > 0;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        int count = 0;
        for (Object object : c.toArray()) {
            add(index, (E) object);
            count++;
        }
        return count > 0;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        int count = 0;
        for (Object o : c.toArray()) {
            remove(o);
            count++;
        }
        return count > 0;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        int count1;
        int count2 = 0;
        for (Node<E> i = head; i != null; i = i.next) {
            count1 = 0;
            for (Object o : c.toArray()) {
                if (i.value.equals(o)) {
                    count1++;
                    break;
                }
            }
            if (count1 == 0) {
                remove(i.value);
                count2++;
            }
        }
        return count2 > 0;
    }

    @Override
    public void clear() {
        for (Node<E> i = head; i != null; i = i.next) {
            if (i.prev != null) {
                i.prev.next = null;
                i.prev = null;
            }
            size--;
        }
        head = null;
        tail = null;
    }

    @Override
    public E get(int index) {
        Node<E> node = head;
        if (index < size()) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        return node.value;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = head;
        if (index < size()) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        node.value = element;
        return node.value;
    }

    @Override
    public void add(int index, E element) {
        Node<E> node = head;
        Node<E> newNode = new Node<>(null, element, null);
        if (index < size() && index >= 0) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            if (node.prev == null) {
                newNode.next = node;
                node.prev = newNode;
                head = newNode;
            } else {
                newNode.prev = node.prev;
                newNode.next = node;
                node.prev.next = newNode;
                node.prev = newNode;
            }
            size++;
        } else if (index == size()) {
            add(element);
        }
    }

    @Override
    public E remove(int index) {
        Node<E> node = head;
        if (index < size() && index >= 0) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            if (node.prev == null) {
                node.next.prev = null;
                head = node.next;
            }
            if (node.next == null) {
                node.prev.next = null;
                tail = node.prev;
            }
            if (node.prev != null && node.next != null) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            size--;
        }
        return node.value;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (Node<E> i = head; i != null; i = i.next) {
            if (i.value.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size() - 1;
        for (Node<E> i = tail; i != null; i = i.prev) {
            if (i.value.equals(o)) {
                return index;
            }
            index--;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> list = new MyLinkedList<>();
        Node<E> node = head;
        for (int i = 0; i < toIndex; i++) {
            if (i >= fromIndex) {
                list.add(node.value);
            }
            node = node.next;
        }
        return list;
    }

    private class Node<E> {
        private Node<E> prev;
        private E value;
        private Node<E> next;

        public Node(Node<E> prev, E value, Node<E> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}
