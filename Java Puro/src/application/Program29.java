package application;

import entities.Frota;
import entities.Veiculo;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos caminhoes? ");
        Integer quantity = leia.nextInt();

        Frota frota = new Frota();

        for(int i = 0; i < quantity; i++){
            System.out.println();
            System.out.println("Caminhão #" + (i + 1) + ": ");
            leia.nextLine();
            System.out.print("Placa: ");
            String placa = leia.nextLine();
            System.out.print("Quilometros Rodados: ");
            Double kl = leia.nextDouble();
            System.out.print("Combustivel Gasto: ");
            Double gasto = leia.nextDouble();
            Veiculo v = new Veiculo(placa, kl, gasto);
            frota.addVeiculo(v);
        }
        System.out.println();
        System.out.println(frota);
    }
}