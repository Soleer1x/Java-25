package application;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = leia.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        double A;
        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < a.length; i++){
            a[i] = leia.nextInt();
        }

        double B;
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < b.length; i++){
            b[i] = leia.nextInt();
        }

        for(int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}