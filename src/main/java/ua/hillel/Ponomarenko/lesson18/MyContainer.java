package ua.hillel.Ponomarenko.lesson18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyContainer implements Collection {

    private Object[] objects = new Object[0];

    public MyContainer() {
    }

    public MyContainer(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "MyContainer{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return objects.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : objects) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] newObjects = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            newObjects[i] = objects[i];
        }
        return newObjects;
    }

    @Override
    public boolean add(Object o) {
        Object[] newObjects = new Object[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            newObjects[i] = objects[i];
        }
        newObjects[objects.length] = o;
        objects = newObjects;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int count = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(o)) {
                Object[] newObjects = new Object[objects.length - 1];
                for (int j = 0; j < i; j++) {
                    newObjects[j] = objects[j];
                }
                for (int j = i; j < newObjects.length; j++) {
                    newObjects[j] = objects[j + 1];
                }
                objects = newObjects;
                count++;
            }
        }
        return count > 0;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c.toArray()) {
            add(o);
        }
        return c.size()>0;
    }

    @Override
    public void clear() {
        objects = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
            int count = 0;
            Object[] obj = toArray();
            clear();
            for (int i = 0; i < obj.length; i++) {
                if (c.contains(obj[i])) {
                    add(obj[i]);
                    count++;
                }
            }
            return count > 0;
    }

    @Override
    public boolean removeAll(Collection c) {
            int count = 0;
            for (Object o : c.toArray()) {
                if (contains(o)) {
                    remove(o);
                    count++;
                }
            }
            return count > 0;
    }

    @Override
    public boolean containsAll(Collection c) {
            int count = 0;
            for (Object o : c.toArray()) {
                if (contains(o)) {
                    count++;
                }
            }
            return count == c.size();
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] newObject = new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            newObject[i] = a[i];
        }
        return newObject;
    }
}
