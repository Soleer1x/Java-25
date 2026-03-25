package application;

import java.util.Locale;
import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite quantidade de linhas da matriz: ");
        int m = leia.nextInt();

        System.out.print("Digite quantidade de colunas da matriz: ");
        int n = leia.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
            }
        }

        System.out.println("Digite um numero que esta na matriz: ");
        int x = leia.nextInt();

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Posição " + i + ", " + j);
                }
                if(j > 0){
                    System.out.println("Left: " + matriz[i][j-1]);
                }
                if(i > 0){
                    System.out.println("Left: " + matriz[i-1][j]);
                }
                if (j < matriz[i].length-1) {
                    System.out.println("Right: " + matriz[i][j+1]);
                }
                if (i < matriz.length-1) {
                    System.out.println("Down: " + matriz[i+1][j]);
                }
            }
        }
    }
}