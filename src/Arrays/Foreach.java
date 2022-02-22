package Arrays;

import java.util.Arrays;
import java.util.Locale;

public class Foreach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double[] notas = {9.9, 8.7, 7.2, 9.4};

        for (double nota:notas){
            System.out.println(notas[2]);
            System.out.println(nota);
        }

    }
}
