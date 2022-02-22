package TratamentoDeExcecoes.ExercicioFixacao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println(7 / entrada.nextInt());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalmente...");
        }

        System.out.println("FIM");

    }
}