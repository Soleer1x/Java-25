package application;

import entities.Laboratorio;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;
        String nome;
        String disciplina;
        int numero;
        int numero2;

    System.out.print("Quantidade de reservatorios: ");
    n = leia.nextInt();

    Laboratorio[] laboratorio = new Laboratorio[6];

    for(int i = 0; i < n; i++){
        System.out.println();
        System.out.println("Laboratorio #" + (i + 1));
        leia.nextLine();
        System.out.print("Nome do professor: ");
        nome = leia.nextLine();
        System.out.print("Disciplina do professor: ");
        disciplina = leia.nextLine();
        System.out.print("Numero do laboratorio: ");
        numero = leia.nextInt();
        laboratorio[numero] = new Laboratorio(nome, disciplina);
    }

    for(int i = 0; i < laboratorio.length; i++){
        if(laboratorio[i] != null){
            System.out.println("Laboratório " + i + ": [Ocupado] | Prof. " + laboratorio[i].getNome() + ", | " + laboratorio[i].getDisciplina() + " |");
        }
        else {
            System.out.println("Laboratorio " + i + ": [Livre]!");
        }
    }
    }
}