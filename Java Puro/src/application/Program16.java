package application;

import entities.Pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Digite a quantidade de produtos para cadastrar: ");
        n = leia.nextInt();

        List<Pedidos> pedido = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Produto #" + (i + 1));
            System.out.print("Id: ");
            Integer id = leia.nextInt();
            System.out.print("Nome: ");
            String nome = leia.next();
            System.out.print("Preço Unitário: ");
            Double preco = leia.nextDouble();
            Pedidos pedidos = new Pedidos(id, nome, preco);
            pedido.add(pedidos);
        }

        System.out.println();
        System.out.println("--- INICIANDO PEDIDO ---");
        System.out.print("Digite o ID do produto que deseja comprar: ");
        int idprocura = leia.nextInt();

        Pedidos ids = null;

        for(int i = 0; i < n; i++) {
            if (pedido.get(i).getId() == idprocura) {
                ids = pedido.get(i);
            }
        }

        if(ids == null){
            System.out.println("ERRO: Este ID de produto não existe! Operação abortada.");
        } else {
            System.out.print("Quantidade: ");
            double quantidade = leia.nextDouble();
            double soma = ids.getPreco() * quantidade;

            System.out.println("\n--- RESUMO DO PEDIDO ---");
            System.out.println("Produto: " + ids.getNome());
            System.out.printf("Quantidade: %.0f%n" , quantidade);
            System.out.printf("Subtotal: R$ %.2f%n", soma);
            System.out.printf("VALOR TOTAL FINAL: R$ %.2f%n", soma);
        }

    }
}