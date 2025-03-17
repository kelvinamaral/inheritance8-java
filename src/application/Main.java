package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer# " + i + " data:");
            System.out.println("Individual or company (i/c)? ");

            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");

            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));

            } else {
                System.out.println("Number of Employess: ");
                int numberOfEmployess = sc.nextInt();
                list.add(new Company(name, income, numberOfEmployess) {
                });
            }

            double sum = 0.0;
            System.out.println();
            System.out.println("TAXES PAID");
            for (TaxPayer tp : list) {
                double tax = tp.tax();
                System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
                sum += tax;

            }

            System.out.println();
            System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));



        }sc.close();
    }
}