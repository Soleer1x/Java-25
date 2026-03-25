package application;

import entities.Colaboradores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos colaboradorees: ");
        int n = leia.nextInt();

        List<Colaboradores> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Colaborador #" + (i + 1));
            System.out.print("Id: ");
            Integer id = leia.nextInt();
            System.out.print("Nome: ");
            String nome = leia.next();
            Colaboradores colaboradores = new Colaboradores(id, nome);
            lista.add(colaboradores);
        }

        System.out.println();
        System.out.print("Digite o ID do colaborador que saiu da empresa: ");
        Integer idremovido = leia.nextInt();

        Colaboradores ids = null;

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getId().equals(idremovido)){
                ids = lista.get(i);
                break;
            }
        }

        if(ids == null){
            System.out.println("Error!");
        } else {
            System.out.println("Removendo " + ids.getNome() + " da equipe...");
            lista.remove(ids);

            System.out.println();
            System.out.println("--- LISTA ATUALIZADA ---");
            for(Colaboradores toString : lista){
                System.out.println(toString);
            }
        }

    }
}