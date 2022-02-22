package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //Scanner entrada = new Scanner(System.in);

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++)
        {
            total += notasAlunoA[i];
        }
        System.out.println(total/notasAlunoA.length);

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        double totalAlunoB = 0;

        System.out.println(notasAlunoB[0]);

        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB/notasAlunoB.length);

       // entrada.close();

    }
}
