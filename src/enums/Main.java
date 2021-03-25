package enums;

public class Main {

    public static void main(String[] args) {

       Level lvl = Level.HARD;

       switch (lvl){

           case LOW:
               System.out.println(lvl);
                break;
           case MEDIUM:
               System.out.println(lvl);
               break;
           case HIGH:
               System.out.println(lvl);
               break;
           default:
               System.out.println("Es wurde kein Level ausgeählt!");
       }

       System.out.println();



        for (Level myLvl: Level.values()) {
            System.out.println(myLvl);
        }

        System.out.println();

        Schaf mySchaf = new Schaf();
        mySchaf.sound();
        mySchaf.sleep();
        System.out.println(mySchaf.istSaeugetier());







    }



}
