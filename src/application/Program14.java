package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Rent[] vetor = new Rent[10];

        String nomes;
        String email;
        int sala;
        int n;

        System.out.print("Quantos quartos serão alugados? ");
        n = leia.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Rent #" + (i + 1));
            leia.nextLine();
            System.out.print("Nome: ");
            nomes = leia.nextLine();
            System.out.print("Email: ");
            email = leia.nextLine();
            System.out.print("Sala: ");
            sala = leia.nextInt();
            vetor[sala] = new Rent(nomes, email);
        }

        System.out.println();
        for(int i = 0; i < 10; i++){
            if(vetor[i] != null){
                System.out.println(i + ": "+ vetor[i]);
            }
        }

        leia.close();
    }
}