import java.util.*;

public class Task2 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        map.put("Hallo","Bye");
        map.put("Hllo","Byef");
        map.put("Halo","Bye2");
        map1.put("Haello","Bye");
        map1.put("Hlo","Byef");
        map1.put("Halo","Bye2");
        printMap(map);
        findKeysByValue(map, "Hallo");
        System.out.println(findKeysByValue(map, "Hallo"));
        mergeMapsIfUniqueKeys(map,map1);
        invertMap(map);
//        countUniqueValues(map);

    }
    public static void  printMap(Map<String, String> map){
        System.out.println(map.entrySet());
    }

    public static Set<String> findKeysByValue(Map<String, String> map, String value) {
        if (map.containsKey(value)){
            System.out.println(map.get(value) + " - " + "with key = " + value);
        }
        return Set.of(map.get(value));
    }

    public static void mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> map = new HashMap<>();
        if (map1.containsKey(map2.keySet())){
            System.out.println("map1 contains key" + map2);
        }
        else {
            map.putAll(map1);
            map.putAll(map2);
            System.out.println(map);
        }
    }

    public static  void invertMap(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<>();
        for (Map.Entry<String,String> e : map.entrySet()) {
            map1.put(e.getValue(), e.getKey());
        }
        System.out.println(map1);
    }

//    public static void countUniqueValues(Map<String, String> map) {
//        int i = 0;
//        for (Map.Entry<String,String> e : map.entrySet()) {
//
//        }
//        System.out.println(i);
//    } забыл как сравнивать разные элементы между собой в мапе

//    дальше по заданиям одни Set но у меня ничего не получается, не могу понять какие команды использовать

}
