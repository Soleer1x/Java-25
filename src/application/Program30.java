package application;

import entities.Prateleira;
import entities.ProdutoAlimenticio;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Prateleira prateleira = new Prateleira();

        System.out.print("Qauntidade de produtos: ");
        Integer quantity = leia.nextInt();

        for(int i = 0; i < quantity; i++){
            System.out.println("\nProduto #" + (i + 1) + ":");
            leia.nextLine();
            System.out.print("Nome do produto: ");
            String nome = leia.nextLine();
            System.out.print("Data Fabricação: ");
            String fabricacao = leia.nextLine();
            LocalDate data = LocalDate.parse(fabricacao);
            System.out.print("Dias de Validade: ");
            Integer dias = leia.nextInt();

            ProdutoAlimenticio pa = new ProdutoAlimenticio(nome, data,  dias);
            prateleira.addProduto(pa);
        }

        System.out.println();
        System.out.println(prateleira);
    }
}