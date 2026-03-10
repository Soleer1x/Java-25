package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        Product[] vect = new Product[n];

        double soma = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = leia.nextLine();
            leia.nextLine();

            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            double preco = leia.nextDouble();
            vect[i] = new Product(nome, preco);
            soma += vect[i].getPreco();
        }
        double media = soma / n;

        System.out.println();
        System.out.printf("Preço medio dos produtos: %.2f" , media);
    }
}
