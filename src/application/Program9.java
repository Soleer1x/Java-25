package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = leia.nextInt();

        double[] abaixo = new double[n];

        double soma = 0;
        for(int i = 0; i < abaixo.length; i++){
            System.out.print("Digite um numero: ");
            abaixo[i] = leia.nextDouble();
            soma = soma + abaixo[i];
        }
        double media = soma / n;

        System.out.printf("\nMEDIA DO VETOR: %.3f%n" , media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < abaixo.length; i++){
            if(abaixo[i] < media){
                System.out.println(abaixo[i]);
            }
        }
    }
}