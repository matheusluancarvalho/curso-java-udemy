package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diadasemana = entrada.next().toUpperCase();

        boolean domingo = diadasemana.equalsIgnoreCase("DOMINGO");
        boolean segunda = diadasemana.equalsIgnoreCase("SEGUNDA");
        boolean terca = diadasemana.equalsIgnoreCase("TERÇA");
        boolean quarta = diadasemana.equalsIgnoreCase("QUARTA");
        boolean quinta = diadasemana.equalsIgnoreCase("QUINTA");
        boolean sexta = diadasemana.equalsIgnoreCase("SEXTA");
        boolean sabado = diadasemana.equalsIgnoreCase("SABADO");

        if(domingo)
         {
            System.out.println(1);
         }
        else if (segunda)
         {
            System.out.println(2);
         }
        else if(terca)
         {
          System.out.println(3);
         }
        else if(quarta)
         {
             System.out.println(4);
         }
        else if(quinta)
        {
            System.out.println(5);
        } else if(sexta)
        {
            System.out.println(6);
        } else if(sabado)
        {
            System.out.println(7);
        }
        else
            System.out.println("Dia da semana não identificado");

        entrada.close();

    }
}
