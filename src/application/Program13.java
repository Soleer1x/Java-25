package application;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = leia.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for(int i = 0; i < n; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = leia.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            genero[i] = leia.next().charAt(0);
        }

        double maior = altura[0];
        double menor = altura[0];

        for(int i = 0; i < n; i++){
            if(altura[i] > maior){
                maior = altura[i];
            }
            if(altura[i] < menor){
                menor = altura[i];
            }
        }

        System.out.println("Menor altura: " + menor);
        System.out.println("maior altura: " + maior);

        double soma = 0;
        double contadorH = 0;
        double contadorM = 0;
        for(int i = 0; i < n; i++){
            if (genero[i] == 'F') {
                contadorM++;
                soma = soma + altura[i];
            }
        }
        double media = soma / contadorM;
        System.out.printf("Media das alturas das mulheres: %.2f%n" , media);

        for(int i = 0; i < n; i++){
            if (genero[i] == 'M') {
                contadorH++;
            }
        }
        System.out.printf("Numero de homens: %.0f%n" , contadorH);
    }
}