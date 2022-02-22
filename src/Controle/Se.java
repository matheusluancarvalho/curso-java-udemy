package Controle;

import java.util.Locale;
import java.util.Scanner;

public class Se {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua média: ");
        double media = entrada.nextDouble();


        if(media <= 10 && media >= 7.0) {
            System.out.println("Passou sua peste!");
            System.out.println("Não fez mais que sua obrigação!");
        }

        if(media < 7 && media >= 4.5){
            System.out.println("Tá de recuperação mané!");
        }

        boolean criterioreprovacaoatingido = media < 4.5 && media >= 0;
        if(criterioreprovacaoatingido){
            System.out.println("Você reprovou burrão");
            System.out.println("Você é a vergonha da profisson");
        }


    }
}
