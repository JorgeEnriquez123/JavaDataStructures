package reviewstructures;

import java.util.HashMap;
import java.util.Map;

public class MapT {
    public static void main(String[] args) {
        Map<Integer, String> bearmap = new HashMap<>();
        bearmap.put(1, "Grizz");
        bearmap.put(2, "Polar");
        bearmap.put(3, "Panda");

        // * map.entrySet() -> to iterate

        for(Map.Entry<Integer, String> entry : bearmap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }

        System.out.println(" ---- ");

        bearmap.entrySet().forEach(x -> System.out.println("Key: " + x.getKey() + " " + "Value: " + x.getValue()));

        System.out.println(" ---- ");

        bearmap.forEach((key, value) -> System.out.println("Key: " + key + " " + "Value: " + value));
    }
}
