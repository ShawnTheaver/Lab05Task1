import java.util.Scanner;

public class Lab05Task1 {
    public static void main(String[] args) {
        // Pseudo code outline
        // Get the price of the item
        // If the price is $100 or more, shipping is free
        // Otherwise, shipping is 2% of the price
        // Output the shipping cost and the total price

        Scanner in = new Scanner(System.in);
        double price = 0;
        String trash = ""; // for bad input

        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine(); // clear the buffer
        } else {
            trash = in.nextLine(); // read as a String
            System.out.println("Invalid input. Please enter a valid price.");
            return;
        }

        double shippingCost;
        if (price >= 100) {
            shippingCost = 0; // free shipping
        } else {
            shippingCost = price * 0.02; // 2% of the price
        }

        double totalPrice = price + shippingCost;

        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);
    }
}