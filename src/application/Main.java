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

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do "+i+"o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();

            taxPayers.add(new TaxPayer(salary, 0, 0, 0, 0));
        }

        for (int i = 0; i < taxPayers.size(); i++) {
            System.out.println("Resumo do "+(i+1)+"o contribuinte:");
            System.out.print("Imposto bruto total: ");
            System.out.print(taxPayers.get(0).grossTax());
        }






        sc.close();
    }
}