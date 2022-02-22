package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair"))
        {
            System.out.print("Você disse: ");
            valor = entrada.nextLine();
        }

        System.out.println("Sistema encerrado com sucesso!");

        entrada.close();

    }
}
