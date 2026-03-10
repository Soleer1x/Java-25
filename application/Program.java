package application;

import java.util.Locale;
import java.util.Scanner;
import util.ContaBancaria;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        ContaBancaria contabancaria;

        System.out.print("Enter account number: ");
        double numeroConta = leia.nextDouble();
        leia.nextLine();

        System.out.print("Enter account holder: ");
        String nomeTitular = leia.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char deposito = leia.next().charAt(0);

        if(deposito == 'y'){
            System.out.print("Enter initial deposit value: ");
            double DepositoInicial = leia.nextDouble();
            contabancaria = new ContaBancaria(numeroConta, nomeTitular, DepositoInicial);
        } else {
            contabancaria = new ContaBancaria(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(contabancaria);

        System.out.print("Enter a deposit value: ");
        double outroDeposito = leia.nextDouble();
        contabancaria.deposit(outroDeposito);
        System.out.println("Update account data: ");
        System.out.println(contabancaria);

        System.out.print("Enter a withdraw value: ");
        double  withdraww = leia.nextDouble();
        contabancaria.withdraw(withdraww);
        System.out.println("Update account data: ");
        System.out.println(contabancaria);

        leia.close();
    }
}
