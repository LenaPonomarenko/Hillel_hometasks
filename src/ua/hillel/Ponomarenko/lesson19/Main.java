package ua.hillel.Ponomarenko.lesson19;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list.add(5));
        list.add(3);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.add(0));
        System.out.println(list.set(1, 6));
        System.out.println(list);
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.add(0);
        list2.add(4);
        System.out.println(list.containsAll(list2));
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.remove(new Integer(4)));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list);
        list.add(0,8);
        list.add(2,9);
        System.out.println(list);
        System.out.println(list.size());
        list.addAll(4,list2);
        System.out.println(list);
//        list.retainAll(list2);
//        System.out.println(list);
//        System.out.println(list.lastIndexOf(0));
//        System.out.println(list.indexOf(0));
        System.out.println(list.subList(1,4));
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}
