package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = leia.nextInt();

        double[] reais = new double[n];

        for(int i = 0; i < reais.length; i++){
            System.out.print("Digite um numero: ");
            reais[i] = leia.nextDouble();
        }

        double maior = reais[0];
        double posicao = 0;
        for(int i = 0; i < reais.length; i++){
            if(reais[i] > maior){
                maior = reais[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR: " + maior);
        System.out.printf("POSICAO DO MAIOR VALOR: %.0f%n" , posicao);
    }
}
