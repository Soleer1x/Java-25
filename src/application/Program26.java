package application;

import entities.Autor;
import entities.Livro;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("DADOS DO AUTOR: ");
        System.out.println();
        System.out.print("Nome: ");
        String nome = leia.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = leia.next();

        Autor escritor = new Autor(nome, nacionalidade);

        System.out.println();
        System.out.println("DADOS DO LIVRO: ");
        leia.nextLine();
        System.out.print("Título: ");
        String titulo = leia.nextLine();
        System.out.print("Ano: ");
        Integer ano = leia.nextInt();

        Livro livro = new Livro(titulo, ano, escritor);

        System.out.println();
        System.out.println("RESUMO DO LIVRO (StringBuilder): ");
        System.out.println(livro);
    }
}