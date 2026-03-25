package application;

import entities.Carrinho;
import entities.Product3;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Carrinho carrinho = new Carrinho();

        System.out.print("Decide comprar quantos produtos? ");
        int n = leia.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Dados do #" + (i + 1) + " produto!");
            leia.nextLine();
            System.out.print("Nome: ");
            String nome = leia.nextLine();
            System.out.print("Preço: ");
            Double preco = leia.nextDouble();
            Product3 product3 = new Product3(nome, preco);
            carrinho.addProduct(product3);
        }
        System.out.println();
        System.out.println(carrinho);
    }
}