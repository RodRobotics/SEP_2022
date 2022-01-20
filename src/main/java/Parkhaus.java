import java.util.HashSet; // Import the HashSet class
public class Parkhaus {
    HashSet<String> cars;
    int capacity;
public Parkhaus(int capacity){
    this.capacity = capacity;
    cars = new HashSet<String>(capacity);
}


public void einparken(String kenzeichen){

if(cars.size() < capacity){
    cars.add(kenzeichen);
    System.out.println("Einparken"+ kenzeichen );
}else{
    System.out.println("Parkhaus ist voll");
}
}

public void ausparken(String kenzeichen){
    if (cars.contains(kenzeichen)){
    cars.remove(kenzeichen);
    System.out.println("Ausgeparkt"+ kenzeichen );
   }else {
       System.out.println("Auto wurde geklaut");
   }

}
 public int platze(){
return capacity - cars.size();

 }
public void getalcars(){
    for(String i : cars){
        System.out.println(i);
    }
}






}
