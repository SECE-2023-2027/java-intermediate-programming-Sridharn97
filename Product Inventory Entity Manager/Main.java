import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String productId = sc.nextLine();
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter stock quantity: ");
        int stockQuantity = sc.nextInt();
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        Product p = new Product(productId, productName, price, stockQuantity);
        p.applyDiscount(discount);
        System.out.println("Product Details:");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price after discount: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());
        sc.close();
    }
}