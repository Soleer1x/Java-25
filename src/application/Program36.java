package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = leia.nextInt();

        List<Employee> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char letra = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Hours: ");
            Integer hora = leia.nextInt();
            System.out.print("Value per hour: ");
            Double valorHora = leia.nextDouble();

            if(letra == 'n'){
                Employee employee = new Employee(name, hora, valorHora);
                lista.add(employee);
            }
            if(letra == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = leia.nextDouble();
                Employee additional = new OutsourcedEmployee(name, hora, valorHora, additionalCharge);
                lista.add(additional);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee employee : lista){
            System.out.println(employee.getName() + " - $ " + employee.payment());
        }
    }
}