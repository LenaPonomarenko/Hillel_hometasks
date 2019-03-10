package ua.hillel.Ponomarenko.lesson20;

public class Main {
    public static void main(String[] args) {
        SimpleTreeSet simpleTreeSet = new SimpleTreeSet();
        simpleTreeSet.add(8);
        simpleTreeSet.add(4);
        simpleTreeSet.add(2);
        simpleTreeSet.add(16);
        simpleTreeSet.add(11);
        simpleTreeSet.add(22);
        System.out.println(simpleTreeSet);
        System.out.println(simpleTreeSet.size());
        System.out.println(simpleTreeSet.contains(6));

        for (Object o : simpleTreeSet) {
            System.out.println(o);
        }
        simpleTreeSet.clear();
        System.out.println(simpleTreeSet);

        for (Object o : simpleTreeSet) {
            System.out.println(o);
        }


        // add parent to node
    }

}
