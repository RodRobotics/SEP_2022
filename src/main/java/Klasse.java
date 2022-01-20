
//Ich bin eine Klasse mit konstruktor geter und seter.
public class Klasse {
    private int data01;
    private String data02;
    private boolean data03;
    private String fahrzeug;

    //konstruktor

    Klasse (String fahrzeug){
        this.fahrzeug = fahrzeug;
      data01 = 0;
      data02 = null;
        data03 = false;
    }


public void setData01(int data01){
        this.data01=data01;
}
    public void setData02(String data02){
        this.data02 = data02;
        data02.toLowerCase();
    }

    public boolean setData03(boolean data03){
        this.data03 = data03;
        return data03;
    }

    public String getSchild(){
        return fahrzeug;
    }











}
