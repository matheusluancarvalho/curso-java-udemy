package Controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        int nota;

        System.out.println("Informe a nota: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10, 9 -> System.out.println("Conceito A");
            case 8, 7 -> System.out.println("Conceito B");
            case 6, 5 -> System.out.println("Conceito C");
            case 4, 3 -> System.out.println("Conceito D");
            case 2, 1, 0 -> System.out.println("Conceito E");
            default -> System.out.println("Conceito não encontrado!");
        }

    }
}
