package application;

import entities.Categoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Cadastre produtos: ");
        int n = leia.nextInt();
        leia.nextLine();

        List<Categoria> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Produto #" + (i + 1));
            System.out.print("Nome: ");
            String nome = leia.nextLine();
            System.out.print("Preço: ");
            Double preco = leia.nextDouble();
            leia.nextLine();
            System.out.print("Categoria: ");
            String categoria = leia.nextLine();
            Categoria categorias = new Categoria(nome, preco, categoria);
            lista.add(categorias);
        }

        System.out.println();
        System.out.print("Digite uma categoria: ");
        String cat = leia.nextLine();

        List<Categoria> filtrados = null;

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getCategoria().equalsIgnoreCase(cat)){
                if(filtrados == null) {
                    filtrados = new ArrayList<>();
                }
                filtrados.add(lista.get(i));
            }
        }

        if(filtrados == null){
            System.out.println("Categoria não encontrada ou sem produtos");
        } else {
            System.out.println();
            System.out.println("--- Produtos encontrados em " + cat.toUpperCase() + " ---");

            double soma = 0;

            for(Categoria categorias : filtrados){
                System.out.println(categorias);
                soma += categorias.getPreco();
            }
            System.out.println();
            System.out.println("Total da Categoria: R$ " + soma);
        }
    }
}