package application;

import entities.Conteudo;
import entities.Filme;
import entities.PedidoEntrega;
import entities.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<Conteudo> lista = new ArrayList<>();

        System.out.print("Titulo Filme: ");
        String tituloFilme = leia.nextLine();
        System.out.print("Ano Lancamento Filme: ");
        int anoLancamentoFilme = leia.nextInt();
        System.out.print("Duracao Minutos: ");
        int duracaoMinutosFilme = leia.nextInt();
        Conteudo conteudo = new Filme(tituloFilme, anoLancamentoFilme, duracaoMinutosFilme);
        lista.add(conteudo);

        System.out.println();
        System.out.print("Titulo Serie: ");
        String tituloSerie = leia.nextLine();
        leia.nextLine();
        System.out.print("Ano Lancamento Serie: ");
        int anoLancamentoSerie = leia.nextInt();
        System.out.print("Temporadas Serie: ");
        int temporadasSerie = leia.nextInt();
        System.out.print("Episodes por temporada: ");
        int episodesPorTemporadaSerie = leia.nextInt();
        Conteudo conteudo1 = new Serie(tituloSerie, anoLancamentoSerie, temporadasSerie, episodesPorTemporadaSerie);
        lista.add(conteudo1);


        System.out.println();
        System.out.println("--- CATÁLOGO STREAMING ---");
        for (Conteudo conteudo3 : lista) {
            System.out.println(conteudo3.descricao());
        }
        System.out.println("--------------------------");
    }
}
