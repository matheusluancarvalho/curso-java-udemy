package TratamentoDeExcecoes.Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTratamentoDeExcecoes {
    public static void main(String[] args) {

        method1();
        //method2();
        System.out.println("End program");
    }
    //------------------------------------------------------------------------------------------------
    public static void method1(){
        System.out.println("***********METHOD 1 START**********");
        method2();
        System.out.println("***********METHOD 1 END**********");
    }


    public static void method2(){

        System.out.println("***********METHOD 2 START**********");

        Scanner entrada = new Scanner(System.in);

        try{
            String[] vect = entrada.nextLine().split(" ");
            int position = entrada.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
            entrada.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        entrada.close();
        System.out.println("***********METHOD 2 END**********");
    }
    //-----------------------------------------------------------------------------------------------

}
