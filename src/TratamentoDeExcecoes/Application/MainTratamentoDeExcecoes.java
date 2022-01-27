package TratamentoDeExcecoes.Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTratamentoDeExcecoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try{
            String[] vect = entrada.nextLine().split(" ");
            int position = entrada.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("End program");
        entrada.close();
    }
}
