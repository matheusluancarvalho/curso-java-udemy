package HerancaEPolimorfismo.application;

import HerancaEPolimorfismo.entities.Account;
import HerancaEPolimorfismo.entities.BusinessAccount;
import HerancaEPolimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria",
                0.0, 500.00);

        //------------------------------UPCASTING---------------------------------------------

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob",
                0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna",
                0.0, 0.01);

        //-----------------------------DOWNCASTING---------------------------------------------

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        // BusinessAccount acc5 = (BusinessAccount)acc3; -> Error! Erro nas classes

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        //----------------------------------@Override--------------------------------------------

        Account acc6 = new Account(1007, "Cebolinha", 1000.00);
        acc6.withdraw(200.00);
        System.out.println("Balance: " + acc6.getBalance());

        Account acc7 = new SavingsAccount(1008, "Pica Pau",
                1000.00, 0.01);
        acc7.withdraw(200.00);
        System.out.println("SavingAccount Balance: " + acc7.getBalance());

        Account acc8 = new BusinessAccount(1009, "Patolino",
                1000.00, 500.00);
        acc8.withdraw(200.00);
        System.out.println("Patolino seu saldo é de: R$ " + acc8.getBalance());

    }
}
