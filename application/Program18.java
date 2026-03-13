package application;

import entities.Presenca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int n = leia.nextInt();

        List<Presenca> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
        System.out.print("Nome do aluno #" + (i + 1) + ": ");
        String nome = leia.next();
        Presenca presenca = new Presenca(nome);
        lista.add(presenca);
        }

        System.out.println();
        System.out.print("Digite o índice do aluno que faltou (0, 1 ou 2): ");
        int indice = leia.nextInt();

        if(indice >= 0 && indice < lista.size()){
            Presenca remover = lista.get(indice);
            System.out.println("Removendo " + remover + " da lista...");
            lista.remove(indice);
        } else {
            System.out.println("Erro: Esse índice não existe!");
        }

        System.out.println();
        System.out.println("Total de alunos: " + lista.size());

        for (Presenca nome : lista){
            System.out.println(nome);
        }
    }
}