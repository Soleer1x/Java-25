package application;

import entities.Assinatura;
import entities.Plano;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Plano plano = new Plano();

        System.out.print("Quantos assinantes: ");
        int quantity = leia.nextInt();
        leia.nextLine();

        for(int i = 0; i < quantity; i++){
            System.out.println("\nCliente #" + (i + 1) + ": ");
            System.out.print("Nome Cliente: ");
            String cliente = leia.nextLine();
            System.out.print("Valor mensal: ");
            Double valorMensal = leia.nextDouble();
            leia.nextLine();
            System.out.print("Data inicio: ");
            String dataInicio = leia.nextLine();
            LocalDate inicio = LocalDate.parse(dataInicio);

            Assinatura assinatura = new Assinatura(cliente, valorMensal, inicio);
            plano.addCliente(assinatura);
        }

        System.out.println();
        System.out.println(plano);
    }
}