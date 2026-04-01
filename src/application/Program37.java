package application;

import entities.Assinatura2;
import entities.enums.TipoPlano;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Assinatura2> lista = new ArrayList<>();

        System.out.print("Cliente: ");
        String cliente = leia.nextLine();
        System.out.print("Data de adesão: ");
        String data = leia.nextLine();
        LocalDate date = LocalDate.parse(data,dtf);
        System.out.print("Plano: ");
        String plano = leia.nextLine();
        TipoPlano tipoPlano = TipoPlano.valueOf(plano);
        Assinatura2 assinatura2 = new Assinatura2(cliente,date,tipoPlano);
        lista.add(assinatura2);

        System.out.println();
        System.out.print(assinatura2);
    }

}