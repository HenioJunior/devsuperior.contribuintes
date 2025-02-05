package application;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do "+i+"o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double service = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capital = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double health = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double education = sc.nextDouble();
            System.out.println();

            taxPayers.add(new TaxPayer(salary, service, capital, health, education));
        }

        for (int i = 0; i < taxPayers.size(); i++) {
            System.out.println("Resumo do "+(i+1)+"o contribuinte:");
            System.out.print("Imposto bruto total: ");
            System.out.printf("%.2f%n", taxPayers.get(i).grossTax());
            System.out.print("Abatimento: ");
            System.out.printf("%.2f%n", taxPayers.get(i).taxRebate());
            System.out.print("Imposto devido: ");
            System.out.printf("%.2f%n", taxPayers.get(i).netTask());
            System.out.println();
        }
        sc.close();
    }
}