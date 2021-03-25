package enums;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        String name;

        System.out.println("Please enter username: ");
        name = myScan.nextLine();
        int alter = myScan.nextInt();

        System.out.println("Bitte gebe noch die Geheimzahl zur Bestätigung ein!!!");
        System.out.println(myScan.hasNextInt());
        if(myScan.hasNextInt()){
            System.out.println("Dein Name ist  " + name + " und du bist " + alter + " Jahre alt");
        }

       // System.out.println(myScan.hasNext());

        myScan.close();





    }

}
