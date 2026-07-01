import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String productId = sc.nextLine();

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter stock quantity: ");
        int stockQuantity = sc.nextInt();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        Product p = new Product(productId, productName, price, stockQuantity);
        p.applyDiscount(discount);

        System.out.println();
        System.out.println("Product Details:");
        System.out.println("ID: " + p.getProductId());
        System.out.println("Name: " + p.getProductName());
        System.out.printf("Price: %.2f%n", p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        sc.close();
    }
}