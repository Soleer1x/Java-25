package application;

import entities.Agendamento;
import entities.Cliente;
import entities.DescricaoServico;
import entities.ItemServico;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Cliente: ");
        String nome = leia.nextLine();
        System.out.print("Telefone: ");
        String telefone = leia.nextLine();
        System.out.print("Data Cadastro: ");
        String dataCadastro = leia.nextLine();
        LocalDate data = LocalDate.parse(dataCadastro, dtf);
        Cliente cliente = new Cliente(nome, telefone, data);

        System.out.println();
        System.out.print("Data entrada: ");
        String dataEntrada = leia.nextLine();
        LocalDate date = LocalDate.parse(dataEntrada, dtf);
        System.out.print("Observação: ");
        String observacao = leia.nextLine();
        Agendamento agendamento = new Agendamento(date, observacao, cliente);

        System.out.println();
        System.out.print("Quantos serviços serão adicionados? ");
        int quantity = leia.nextInt();

        for(int i = 0; i < quantity; i++){
            System.out.println("\nDados do serviço #" + (i + 1) + ": ");
            leia.nextLine();
            System.out.print("Nome do serviço: ");
            String nomeServico = leia.nextLine();
            System.out.print("Preço do serviço: ");
            Double precoSevico = leia.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantidade = leia.nextInt();
            DescricaoServico ds = new DescricaoServico(nomeServico, precoSevico);
            ItemServico is = new ItemServico(quantidade, precoSevico, ds);
            agendamento.addServico(is);
        }

        System.out.println();
        System.out.println(agendamento);
    }
}