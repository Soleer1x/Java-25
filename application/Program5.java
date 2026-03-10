package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = leia.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        double soma = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1 ) + "a pessoa: ");
            leia.nextLine();
            System.out.print("Nome: ");
            nome[i] = leia.nextLine();
            System.out.print("Idade: ");
            idade[i] = leia.nextInt();
            System.out.print("Altura: ");
            altura[i] = leia.nextDouble();
            soma = soma + altura[i];
        }
        double media = soma / n;

        double menores = 0;
        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                menores++;
            }
        }
        double percentualMenores = ((double)menores / n) * 100.0;

        System.out.println();
        System.out.printf("Altura media: %.2f%n" , media);
        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");

        for(int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }
    }
}
