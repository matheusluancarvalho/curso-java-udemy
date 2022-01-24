package HerancaEPolimorfismo.ClassesAbstratas.Application;

import HerancaEPolimorfismo.ClassesAbstratas.Entities.Account;
import HerancaEPolimorfismo.ClassesAbstratas.Entities.BusinessAccount;
import HerancaEPolimorfismo.ClassesAbstratas.Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainClassesAbstratas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /*
        Account acc1 = new Account(1001, "Patolino", 1000.00);

        Account acc2 = new SavingsAccount(1002, "Gaginho",
                1000.00, 0.01);

        Account acc3 = new BusinessAccount(1003, "Pernalonga",
                1000.00, 500.00);

        */

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Peter Parker",
                500.00, 0.01));

        list.add(new BusinessAccount(1002,"Zorro",
                1000.00, 400.00));

        list.add(new SavingsAccount(1003, "Thor",
                300.00, 0.01));

        list.add(new BusinessAccount(1004,"Sheldon Cooper",
                500.00, 500.00));

        double sum = 0.0;

        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total Balance: R$ %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.00);
        }

        for (Account acc : list){
            System.out.printf("Update Balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }



    }
}
