
import java.lang.Math;
import java.util.Arrays;

public class Sortieren {
    public static void main(String[] args) {

        sortieren(random());


    }

    private static double[] random(){
        double [] zufaellig = new double[10];
        for(int i = 0; i < zufaellig.length; i++){

            zufaellig[i] = (int) (Math.random() * 100.00);
            System.out.print(" " + zufaellig[i]);
        }

        return zufaellig;
    }



    public static double[] sortieren (double[] zuSortieren){
        System.out.println();
        for(int i = 0; i < zuSortieren.length- 1; i++){
            for(int j = 0; j < zuSortieren.length - 1; j++){
                if(zuSortieren[j] > zuSortieren[j + 1]){
                    double zwischenSpeicher = zuSortieren[j];
                    zuSortieren[j] = zuSortieren[j + 1];
                    zuSortieren[j + 1] = zwischenSpeicher;
                }
            }



            System.out.print(" " + zuSortieren[i]);

        }


        return zuSortieren;


    }





}
