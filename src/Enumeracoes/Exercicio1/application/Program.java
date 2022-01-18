package Enumeracoes.Exercicio1.application;

import Enumeracoes.Exercicio1.entities.Departament;
import Enumeracoes.Exercicio1.entities.HourContract;
import Enumeracoes.Exercicio1.entities.Worker;
import Enumeracoes.Exercicio1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = entrada.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = entrada.nextLine();

        System.out.print("Lavel: ");
        String workerLevel = entrada.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = entrada.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departament(departamentName));

        System.out.print("How many contracts to this worker? ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entrada.next());

            System.out.print("Value per hour: ");
            double valuePerHour = entrada.nextDouble();

            System.out.print("Duration (hour): ");
            int hour = entrada.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YY): ");
        String monthAndYear = entrada.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        // Começa na posição 0 e vai até a posição 1, que é o dia do mês

        int year = Integer.parseInt(monthAndYear.substring(3));
        // Começa na posição 3 e vai até o final, que é o mês

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": "
                + String.format("%2f", worker.income(year, month)));

        entrada.close();
    }
}
