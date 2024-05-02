
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create electronic product
        Electronics electronicProduct = new Electronics(1, "smartphone", 599.9f, "Samsung", 1);

        // Create clothing product
        clothing clothingProduct = new clothing(2, "T-shirt", 19.99f, "Medium", "Cotton");

        // Create book product
        book bookProduct = new book(3, "OOP", 39.99f, "O'Reilly", "X Publications");

        // Create a customer
        System.out.print("Enter your customer ID: ");
        int customerId = Math.abs(scanner.nextInt()); // Take absolute value
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address);

        // Create a shopping cart
        System.out.print("How many products do you want to order? ");
        int numProducts = Math.abs(scanner.nextInt()); // Take absolute value
        Cart cart = new Cart(customerId, numProducts);

        // Add products to the cart
        int i = 0;
        while( i < numProducts) {
            System.out.print("Enter product ID to add to the cart:\n "+"1="+electronicProduct.name +"\t2="+clothingProduct.name+"\t3="+bookProduct.name+"/n");
            int productId = Math.abs(scanner.nextInt()); // Take absolute value
            if (productId == 1) {
                cart.addProduct(electronicProduct,i);
            } else if (productId == 2) {
                cart.addProduct(clothingProduct,i);
            } else if (productId == 3) {
                cart.addProduct(bookProduct,i);
            } else {
                System.out.println("Invalid product ID.please enter it again");
           continue;
            }
           i++;
        }

        // Ask if the user wants to place an order
        System.out.print("your total price is "+cart.calculatePrice()+"$ Do you want to place an order? (yes/no): ");
        String placeOrder=scanner.next();
       cart.PlaceOrder( placeOrder);
       
        if (placeOrder.equalsIgnoreCase("yes")) {
            Order order = new Order(customerId, 0, cart.getProducts(), cart.calculatePrice());
            System.out.println("Order placed successfully!");
            order.printOrderInfo();
        } else {
            System.out.println("Order not placed. Thank you for using the E-Commerce System!");
        }
      
   
        scanner.close();
    }
}
