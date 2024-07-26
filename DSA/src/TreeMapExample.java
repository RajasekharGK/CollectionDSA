import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ramesh",10);
        map.put("Ganesh",50);
        map.put("Suresh",20);
        map.put("Zaheer",60);
        map.put("Jamal",30);

        System.out.println("map:"+map);


        Map<String,Integer> map1 = new TreeMap<>();
        map1.put("R",10);
        map1.put("G",50);
        map1.put("S",20);
        map1.put("a",60);
        map1.put("x",30);

        System.out.println("map1:"+map1);

        Map<Emp,Integer> map2 = new TreeMap<>();
        map2.put(new Emp(12,"Ramesh"),10);
        map2.put(new Emp(8,"Gopi"),50);
        map2.put(new Emp(6,"Farook"),20);
        map2.put(new Emp(18,"ABC"),60);
        map2.put(new Emp(20,"Zaheer"),30);
        map2.put(new Emp(20,"SAS"),40);

        System.out.println("map2:"+map2);

    }
}
