package application;

import entities.PedidoEntrega;
import entities.enums.TipoEnvio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<PedidoEntrega> lista = new ArrayList<>();

        System.out.print("Nome Produto: ");
        String nome = leia.nextLine();
        System.out.print("Valor produto: ");
        double valor = leia.nextDouble();
        leia.nextLine();
        System.out.print("Tipo de envio: ");
        String tipo = leia.nextLine();
        TipoEnvio tipoEnvio = TipoEnvio.valueOf(tipo);

        PedidoEntrega pedidoEntrega = new PedidoEntrega(nome, valor, tipoEnvio);
        lista.add(pedidoEntrega);

        System.out.println();
        System.out.print(pedidoEntrega);
    }
}