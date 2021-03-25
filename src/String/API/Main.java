package String.API;
import java.lang.String;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        String name;
        System.out.println("Bitte Namen eingeben! --- Groß-& KLeinschreibung spielt keine Rolle!");
        name = myScan.nextLine();
        name = name.toLowerCase();
        System.out.println("Kleinschreibung: " + name);
        System.out.println("Großschreibung: " + name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.lastIndexOf(2));
        System.out.println(name.hashCode());
        if(name.equals("phil")){
            System.out.println("Zugriff gewährt");
        } else{
            System.out.println("Sie sind kein Nutzer von diesem System");
        }




    }

}
