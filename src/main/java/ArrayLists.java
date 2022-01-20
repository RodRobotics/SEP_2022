import java.util.ArrayList; // import the ArrayList class
public class ArrayLists {
    ArrayList<String> cars = new ArrayList<String>(42); // Create an ArrayList object

public void add(){
    cars.add(0,"VW");
}
    public void remove(){
        cars.remove(0);
    }
    public void get(){
        cars.get(0);
    }
    public void Loop() {
        for (int i = 0; i < cars.size(); i++)

            System.out.println(cars.get(i));
        cars.get(5).isEmpty();

    }












}
