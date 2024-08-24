 class product {
    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0;

   product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID=" + prodId);
        System.out.println("Price=" + price);
        System.out.println("Quantity=" + quantity);
    }

    void calculateTotalPrice() {
        totalPrice += quantity * price;
    }
    
}

public class t10 {
    public static void main(String[] args) {
        product[] products = new product[5];
        products[0] = new product(1, 10.5, 2);
        products[1] = new product(2, 20.0, 3);
        products[2] = new product(3, 15.75, 1);
        products[3] = new product(4, 8.99, 4);
        products[4] = new product(5, 5.25, 2);

        for (int i = 0; i < 5; i++) {
            products[i].display();
            System.out.println();
            products[i].calculateTotalPrice();
        }

        System.out.println("Total Price=" + product.totalPrice);
    }
}
