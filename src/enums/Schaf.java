package enums;

public class Schaf implements Animal, Saeugetier {

    public void sound(){
        System.out.println("Mähhhh");
    }

    public void sleep(){
        System.out.println("zzzz");
    }


    public boolean istSaeugetier(){

        return true; 

    }


}
