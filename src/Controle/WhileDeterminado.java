package Controle;

public class WhileDeterminado {
    public static void main(String[] args) {

        int contador = 1;
        int contador2 = 0;

        while (contador <= 10)
        {
            System.out.println("Bom dia");
            contador++;
        }

        System.out.println("\n");

        while (contador2 <= 20)
        {
            System.out.printf("i = %d\n", contador2);
            contador2 += 2;
        }

    }
}
