package OOPS.Keywords;

class Product {
    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    // Constructor
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        double finalPrice = price - (price * discount / 100);
        System.out.println("Product: " + productName);
        System.out.println("Price after discount: " + finalPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Phone", 20000, 2, 102);

        if (p1 instanceof Product) {
            p1.display();
        }

        Product.updateDiscount(20);

        if (p2 instanceof Product) {
            p2.display();
        }
    }
}