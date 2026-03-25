package application;

import entities.Estoque;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Digite a quantidade de produtos para cadastrar: ");
        n = leia.nextInt();

        List<Estoque> estoques = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Produto #" + (i + 1));
            System.out.print("Id: ");
            Integer id = leia.nextInt();
            System.out.print("Nome: ");
            String nome = leia.next();
            System.out.print("Estoque Atual: ");
            Double estoque = leia.nextDouble();
            Estoque estoque1 = new Estoque(id, nome, estoque);
            estoques.add(estoque1);
        }

        System.out.println();
        System.out.println("--- OPERAÇÃO BAIXA DE ESTOQUE ---");
        System.out.print("Digite o ID do produto: ");
        int idprocurado = leia.nextInt();

        Estoque guarda = null;

        for(int i = 0; i < n; i++){
            if(estoques.get(i).getId() == idprocurado){
                guarda = estoques.get(i);
            }
        }

        if (guarda == null) {
            System.out.println("Error: ID não encontrado!");
        } else {
            System.out.print("Quantidade para retirar: ");
            double quantidade = leia.nextDouble();

            if (quantidade > guarda.getEstoque()) {
                System.out.println("Erro: Saldo insuficiente!");
            } else {
                guarda.darBaixa(quantidade);

                System.out.println();
                System.out.println("--- LISTAGEM ATUALIZADA ---");

                for (int i = 0; i < estoques.size(); i++) {
                    System.out.print(estoques.get(i));
                }
            }
        }

    }
}
