package Controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        boolean notainvalida = nota > 10 || nota < 0;
        boolean notapassar = nota <= 10 && nota >= 7.0;
        boolean notarecuperacao = nota < 7.0 && nota >= 6.0;
        boolean notareprovado = nota < 6.0 && nota >= 0;

        if(notainvalida)
        {
            System.out.println("Nota Inválida");
        }
        else if (notapassar)
            {
                System.out.println("Parabéns!");
                System.out.println("Você foi aprovado(a)!");
            }
        else if (notarecuperacao)
            {
                System.out.println("Você está de recuperação!");
                System.out.println("É a hora de correr atrás do tempo perdido!");
            }
        else if (notareprovado)
            {
                System.out.println("Infelizmente você foi reprovado!");
            }

        entrada.close();

    }
}
