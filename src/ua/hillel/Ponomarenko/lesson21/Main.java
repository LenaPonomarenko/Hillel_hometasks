package ua.hillel.Ponomarenko.lesson21;



public class Main {
    public static void main(String[] args) {
        SimpleMap map = new SimpleMap(10);
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        System.out.println(map.get("key1"));
        System.out.println(map.get("key"));
        System.out.println(map);
        System.out.println(map.size());
//        map.clear();
//        System.out.println(map);
        System.out.println(map.containsKey("key1"));
        System.out.println(map.containsKey("keydafd"));
        System.out.println(map.containsValue("value3"));
        System.out.println(map.containsValue("keydafd"));
        System.out.println(map.remove("key2"));
        System.out.println(map);
    }
}
