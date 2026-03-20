package application;

import entities.Aluno;
import entities.Disciplina;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome da disciplina: ");
        String nameDisciplina = leia.nextLine();
        System.out.print("Digite a quantidade de alunos: ");
        Integer quantity = leia.nextInt();

        Disciplina disciplina = new Disciplina(nameDisciplina);

        for(int i = 0; i < quantity; i++){
            System.out.println();
            System.out.print("Nome do aluno #" + (i + 1) + ": ");
            leia.nextLine();
            String nameAluno = leia.nextLine();
            System.out.print("Nota final do " + nameAluno + ": ");
            Double notaFinal = leia.nextDouble();

            Aluno aluno = new Aluno(nameAluno, notaFinal);
            disciplina.addAluno(aluno);
        }

        System.out.println();
        System.out.println(disciplina);
    }
}