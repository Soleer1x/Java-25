package application;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;
import entities.enums.Nivel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos Funcionário? ");
        int quantity = leia.nextInt();
        leia.nextLine();

        for(int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.print("Nome Funcionário #" + (i + 1) + ": ");
            String nome = leia.nextLine();
            System.out.print("Nível: ");
            String level = leia.nextLine();
            Nivel nivel = Nivel.valueOf(level);
            System.out.print("Salario base: ");
            double salarioBase = leia.nextDouble();

            System.out.print("D para Dev, G para Gerente: ");
            char letra = leia.next().charAt(0);
            leia.nextLine();

            if(letra == 'D'){
                System.out.print("Linguagem principal: ");
                String linguagem = leia.nextLine();
                Funcionario funcionario = new Desenvolvedor(nome, nivel, salarioBase, linguagem);
                lista.add(funcionario);
            } else if (letra == 'G'){
                System.out.print("Gratificação: ");
                double gratificacao = leia.nextDouble();
                leia.nextLine();
                Funcionario funcionario = new Gerente(nome, nivel, salarioBase, gratificacao);
                lista.add(funcionario);
            }
        }

        System.out.println();
        System.out.print("--- FOLHA DE PAGAMENTO ---");
        for(Funcionario funcionario : lista){
            System.out.print(funcionario.toString());
        }

    }
}