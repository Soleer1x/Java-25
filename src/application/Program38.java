package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<Contribuinte> lista = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = leia.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.print("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char letra = leia.next().charAt(0);
            System.out.print("Name: ");
            String name = leia.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = leia.nextDouble();

            if(letra == 'i'){
                System.out.print("Health expenditures: ");
                double health = leia.nextDouble();
                Contribuinte contribuinte = new PessoaFisica(name, anualIncome, health);
                lista.add(contribuinte);
            }
            else {
                System.out.print("Number of employees: ");
                int employees = leia.nextInt();
                Contribuinte contribuinte = new PessoaJuridica(name , anualIncome, employees);
                lista.add(contribuinte);
            }
        }
    }
}