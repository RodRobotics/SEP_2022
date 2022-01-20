public class Parkieren {
    Parkhaus City;
    Auto auto1;
    Auto auto2;
    Auto auto3;
    Auto auto4;
    public  Parkieren(){
       City = new Parkhaus(3);
        auto1 = new Auto("ZH123489");
        auto2 = new Auto("ZH333489");
        auto3 = new Auto("ZH333666");
        auto4 = new Auto("ZH111999");
    }
public void run(){
City.einparken(auto1.getkenzeichen());
City.einparken(auto2.getkenzeichen());
City.einparken(auto3.getkenzeichen());
City.einparken(auto4.getkenzeichen());
System.out.println(City.platze());
City.ausparken("ZH1213");
System.out.println(City.platze());
City.getalcars();


}





}
