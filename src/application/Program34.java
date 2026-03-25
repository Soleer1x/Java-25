package application;

import entities.Servico;
import entities.enums.Prioridade;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Descrição: ");
        String descricao = leia.nextLine();
        System.out.print("Data inicio: ");
        String dataInicio = leia.nextLine();
        LocalDate data = LocalDate.parse(dataInicio, dtf);
        System.out.print("Prioridade: ");
        String p = leia.nextLine();
        Prioridade prioridade = Prioridade.valueOf(p);
        Servico servico = new Servico(descricao, data, prioridade);

        System.out.println();
        System.out.println(servico);
    }
}
