package ua.hillel.Ponomarenko.lesson20;


import java.util.*;

public class SimpleTreeSet implements Iterable {

    private Node root;
    private int size = 0;

    private class Node {
        Node left;
        Object value;
        Node right;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(Object o) {
        if (isEmpty() || find(root, o) == null) {
            return false;
        } else {
            return true;
        }
    }

    private Node find(Node node, Object o) {
        Integer nodeValue = (Integer) node.value;
        Integer oValue = (Integer) o;
        if (oValue.equals(nodeValue)) {
            return node;
        } else if (oValue < nodeValue) {
            if (node.left == null) {
                return null;
            } else {
                return find(node.left, o);
            }
        } else if ((oValue > nodeValue)) {
            if (node.right == null) {
                return null;
            } else {
                return find(node.right, o);
            }
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index=0;
            private List list = new ArrayList();
            {
                list = putInArray(root,list);
            }

            @Override
            public boolean hasNext() {
                if(list.size()==0){
                    return false;
                }else{
                    return list.size()>index;
                }
            }

            @Override
            public Object next() {
                Object result = list.get(index);
                index++;
                return result;
            }
        };
    }

    public Object[] toArray() {
        if(isEmpty()){
            return new Object[0];
        }
        else{
            List list = new ArrayList();
            list = putInArray(root,list);
            return list.toArray();
        }
    }

    private List putInArray(Node node, List list) {
        if(node==null){
            return new ArrayList();
        }else{
            if (node.left == null) {
                list.add(node.value);
                if (node.right == null) {
                    return list;
                } else {
                    list = putInArray(node.right, list);
                }
            } else {
                list = putInArray(node.left, list);
                list.add(node.value);
                if (node.right == null) {
                    return list;
                } else {
                    list = putInArray(node.right, list);
                }
            }
            return list;
        }
    }


    public boolean add(Object o) {
        if (isEmpty()) {
            root = new Node();
            root.value = o;
            size++;
            return true;
        } else {
            return append(root, o);
        }
    }

    private boolean append(Node appendIn, Object value) {
        Integer existing = (Integer) appendIn.value;
        Integer valueInt = (Integer) value;
        if (valueInt < existing) {
            if (appendIn.left == null) {
                Node newNode = new Node();
                newNode.value = value;
                appendIn.left = newNode;
                size++;
                return true;
            } else {
                return append(appendIn.left, value);
            }
        } else if (valueInt > existing) {
            if (appendIn.right == null) {
                Node newNode = new Node();
                newNode.value = value;
                appendIn.right = newNode;
                size++;
                return true;
            } else {
                return append(appendIn.right, value);
            }
        }
        return false;
    }

    public void clear() {
        root = null;
        size=0;
    }

    @Override
    public String toString() {
            Iterator iterator = iterator();
            String string = "";
            while(iterator.hasNext()){
                string = string+iterator.next()+" ";
            }
            return "Simple Tree Set: "+string;
    }
}
