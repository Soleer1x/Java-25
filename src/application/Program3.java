package application;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        double[] vetor = new double[n];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.print(vetor[i] + "\n");
            }
        }
    }
}