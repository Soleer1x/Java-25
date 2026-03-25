package application;

import entities.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program20 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas? ");
        int n = leia.nextInt();

        List<Pessoas> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Pessoa #" + (i + 1));
            System.out.print("Id: ");
            Integer id = leia.nextInt();
            leia.nextLine();
            System.out.print("Nome: ");
            String nome = leia.nextLine();
            System.out.print("Salario: ");
            Double salario = leia.nextDouble();
            Pessoas pessoas = new Pessoas(id, nome, salario);
            lista.add(pessoas);
        }

        System.out.println();
        System.out.print("Digite um id de uma pessoa: ");
        int idprocura = leia.nextInt();

        Pessoas ids = null;

        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(idprocura)) {
                ids = lista.get(i);
                break;
            }
        }

            if(ids == null){
                System.out.println("Error, abortar!");
            } else {
                System.out.print("Nota de performance do " + ids.getNome() + " (de 1 a 10): ");
                double nota = leia.nextDouble();

                if(nota > 8){
                    ids.aumento(15.0);
                } else if (nota >= 5 ){
                    ids.aumento(5.0);
                } else {
                    System.out.println("Performance abaixo do esperado!");
                }
                System.out.println("\n---- Salários atualizados ----");
                for (Pessoas toString : lista){
                    System.out.println(toString);
                }
            }
    }
}
