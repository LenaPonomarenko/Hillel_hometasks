package ua.hillel.Ponomarenko.lesson18;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Object[] objects1 = new Object[]{6,7,16,6,3};
        Object[] objects2 = new Object[]{8,7,6};

        MyContainer container1 = new MyContainer(objects1);
        MyContainer container2 = new MyContainer(objects2);

//        System.out.println(container1.size());
//        System.out.println(container1.isEmpty());
//        System.out.println(container2.isEmpty());
//        System.out.println(container1.contains(4));
//        System.out.println(container1.contains(55));
//        System.out.println();
//
//        Object[] objects3 = container2.toArray();
//        MyContainer container3 = new MyContainer(objects3);
//        System.out.println(container3);
//        container1.add(6);
//        System.out.println(container1);
//        System.out.println(container1.remove(6));
//        System.out.println(container1);

//        System.out.println(container1.addAll(container2));
//        System.out.println(container1);
//        container1.clear();
//        System.out.println(container1);

//        container1.retainAll(container2);
//        System.out.println(container1);

 //       System.out.println(container1.removeAll(container2)+"  "+container1);
        System.out.println(container1.containsAll(new MyContainer(new Object[]{7,3})));

    }
}
