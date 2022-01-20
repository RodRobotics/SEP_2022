import java.util.HashMap; // import the HashMap class
public class HashMaps {
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    public void add(){
        capitalCities.put("England", "London");
    }
    public void get(){
        capitalCities.get("England");
    }
    public void remove(){
        capitalCities.remove("England");
    }
public void Loop(){
// Print values
    for (String i : capitalCities.values()) {
        System.out.println(i);
    }
// Print keys and values
    for (String i : capitalCities.keySet()) {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }

}













}
