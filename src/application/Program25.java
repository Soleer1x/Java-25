package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Client Data:");
        System.out.print("Name: ");
        String name = leia.nextLine();
        System.out.print("Email: ");
        String email = leia.nextLine();
        System.out.print("Birth order data (dd/MM/yyyy): ");
        Date birthDate = sdf.parse(leia.next());

        Client client = new Client(name, email, birthDate);

        System.out.print("Enter order data:");
        System.out.print("Status: ");
        String statusString = leia.next();
        OrderStatus status = OrderStatus.valueOf(statusString);
        System.out.println("How many items to this order? ");
        int n = leia.nextInt();

        Order order = new Order(new Date(), status, client);

        for(int i = 0; i < n; i++){
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            String productName = leia.next();
            System.out.print("Product price: ");
            double productPrice = leia.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = leia.nextInt();
            Product2 product2 = new Product2(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product2);

            order.addItem(orderItem);
        }
        System.out.println(order);
}
}