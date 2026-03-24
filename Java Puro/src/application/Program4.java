package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        double[] vetor = new double[n];

        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextDouble();
            soma = soma + vetor[i];
        }
        double media = soma / vetor.length;

        System.out.println();
        System.out.print("VALORES = ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f" , soma);
        System.out.println();
        System.out.printf("MEDIA = %.2f" , media);
    }
}