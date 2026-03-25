package application;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = leia.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            leia.nextLine();
            System.out.print("Nome: ");
            nomes[i] = leia.nextLine();
            System.out.print("Idade: ");
            idades[i] = leia.nextInt();
        }

        double maior = idades[0];
        int posicao = 0;
        for(int i = 0; i < n; i++) {
            if (idades[i] > maior){
                maior = idades[i];
                posicao = i;
            }
        }
        System.out.print("PESSOA MAIS VELHA: " + nomes[posicao]);
    }
}