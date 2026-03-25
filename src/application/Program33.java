package application;

import entities.Pedido;
import entities.enums.StatusPedido;
import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o id do pedido: ");
        Integer id = leia.nextInt();
        leia.nextLine();
        System.out.print("Digite a data do pedido: ");
        String data = leia.nextLine();
        LocalDate date = LocalDate.parse(data, dtf);
        System.out.print("Status: ");
        String status = leia.nextLine();
        StatusPedido statusPedido = StatusPedido.valueOf(status);
        Pedido pedido = new Pedido(id, date, statusPedido);

        System.out.println();
        System.out.println(pedido);
    }
}