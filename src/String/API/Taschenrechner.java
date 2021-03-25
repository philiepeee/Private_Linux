package String.API;
import java.util.Scanner;


public class Taschenrechner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ergebnis;
        String operation;

        System.out.println("Bitte geben Sie a ein!");
        int a = scanner.nextInt();

        System.out.println("Bitte geben Sie die Rechenoperation ein!");
        operation = scanner.next();

        System.out.println("Bitte geben Sie b ein!");
        int b = scanner.nextInt();

        switch (operation){
            case "+":
                ergebnis = a + b;
                break;
            case "-":
                ergebnis = a - b;
                break;
            case "/":
                ergebnis = a / b;
                break;
            case "*":
                ergebnis = a * b;
                break;
            default:
                System.out.println("Es gab eine falsche Eingabe!");
                ergebnis = 0;
        }

        System.out.println("es hat funktiioniert");
        System.out.println();
        System.out.println("hehe");
        System.out.println("ich hoffe das ist auch gleich da xD");
        System.out.println("------------------------------");
        System.out.println("Das Ergebnis ist: " + ergebnis);

        scanner.close();



    }



}
