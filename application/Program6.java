package application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = leia.nextInt();

        int[] pares = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            pares[i] = leia.nextInt();
        }

        double somaPares = 0;
        System.out.println();
        System.out.println("Numeros pares: ");
        for(int i = 0; i < n; i++) {
            if (pares[i] % 2 == 0){
                System.out.print(pares[i] + " ");
                somaPares++;
            }
        }
        System.out.println();
        System.out.printf("\nQUANTIDADE DE PARES: %.0f%n" , somaPares);
    }
}
