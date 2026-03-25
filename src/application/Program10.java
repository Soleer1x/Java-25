package application;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = leia.nextInt();

        int[] pares = new int[n];

        for(int i = 0; i < pares.length; i++){
            System.out.print("Digite um numero: ");
            pares[i] = leia.nextInt();
        }

        double somaPares = 0;
        double contador = 0;
        for(int i = 0; i < pares.length; i++){
            if(pares[i] % 2 == 0){
                somaPares = somaPares + pares[i];
                contador++;
            }
        }
        double media = somaPares / contador;

        if(contador == 0){
            System.out.println("NENHUM NUMERO PAR!");
        }else {
            System.out.println("MEDIA DOS PARES: " + media);
        }
    }
}