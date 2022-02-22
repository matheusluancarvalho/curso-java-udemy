package Controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int QuantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;


        while (nota != -1)
        {

            System.out.print("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >=0)
            {
                total += nota;
                QuantidadeDeNotas++;
            }
            else if (nota != -1)
            {
                System.out.println("Nota inválida!!!");
            }
        }

        // Calcular a média

        double media = total / QuantidadeDeNotas;
        System.out.println("Média = " + media);


        entrada.close();

    }
}
