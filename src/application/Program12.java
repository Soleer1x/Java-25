package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos alunos serao digitados? ");
        n = leia.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        double soma = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            leia.nextLine();
            nomes[i] = leia.nextLine();
            nota1[i] = leia.nextDouble();
            nota2[i] = leia.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < n; i++) {
            soma = nota1[i] + nota2[i];
            double media = soma / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
    }
}