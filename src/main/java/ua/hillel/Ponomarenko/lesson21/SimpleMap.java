package ua.hillel.Ponomarenko.lesson21;


import java.util.*;

public class SimpleMap<K, V> implements Map<K, V>, Iterable<K> {
    private int capacity;
    private Entry<K, V>[] entries;

    public SimpleMap() {
        this.capacity = 10;
    }

    public SimpleMap(int capacity) {
        this.capacity = capacity;
        this.entries = new Entry[capacity];
    }

    @Override
    public int size() {
        int size = 0;
        for (Entry<K, V> entry : entries) {
            if (entry != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            entries[i] = null;
        }
    }

    private int getIndex(Object key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    @Override
    public V get(Object key) {
        int index = getIndex(key);
        if (entries[index] == null) {
            return null;
        } else {
            if (key.equals(entries[index].key)) {
                return entries[index].value;
            }
            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Entry entry = new Entry(key, value);
        if (entries[index] == null) {
            entries[index] = entry;
            return null;
        } else {
            V previous = entries[index].value;
            entries[index] = entry;
            return previous;
        }
    }

    @Override
    public String toString() {
        String str = new String();
        if (!isEmpty()) {
            for (Entry<K, V> entry : entries) {
                if (entry != null) {
                    str = str + entry.key + "=" + entry.value + ", ";
                }
            }
            str = str.substring(0, str.length() - 2);
        }
        return "SimpleMap{" + str + '}';
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                if(index<size()&&index>=0){
                    if(entries[index]!=null){
                        return true;
                    }else{
                        while(index<capacity&&entries[index]==null){
                            index++;
                        }
                        return index<capacity;
                    }
                }
                return false;
            }

            @Override
            public K next() {
                K key = entries[index].key;
                index++;
                return key;
            }
        };
    }

    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        int index = getIndex(key);
        if (entries[index] != null && entries[index].key.equals(key)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Entry<K, V> entry : entries) {
            if (entry != null && entry.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V remove(Object key) {
        int index = getIndex(key);
        if (entries[index] != null && entries[index].key.equals(key)) {
            V value = entries[index].value;
            entries[index] = null;
            return value;
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K k : m.keySet()) {
            put(k, m.get(k));
        }
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new TreeSet<>();
        for (int i = 0; i < capacity; i++) {
            if(entries[i]!=null){
                set.add(entries[i].key);
            }
        }
        return set;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            if(entries[i]!=null){
                collection.add(entries[i].value);
            }
        }
        return collection;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
//        Set<Map.Entry<K, V>> set = new TreeSet<>();
//        for (int i = 0; i < capacity; i++) {
//            if(entries[i]!=null){
//                set.add(entries[i]);
//            }
//        }
        return null;
    }

}
