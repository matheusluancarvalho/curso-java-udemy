package TratamentoDeExcecoes.ExercicioFixacao.application;

import TratamentoDeExcecoes.ExercicioFixacao.entities.Account;

import TratamentoDeExcecoes.ExercicioFixacao.exceptions.BusinessException;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe os dados da conta!");

        System.out.print("Número: ");
        int number = entrada.nextInt();

        System.out.print("Titular: ");
        entrada.nextLine();
        String holder = entrada.nextLine();

        System.out.print("Saldo inicial: ");
        double balance = entrada.nextDouble();

        System.out.print("Limite de saque: ");
        double withdrawLimit = entrada.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.print("\nInforme uma quantia para sacar: ");
        double amout = entrada.nextDouble();


        try {
            acc.whithdraw(amout);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        entrada.close();
    }
}
