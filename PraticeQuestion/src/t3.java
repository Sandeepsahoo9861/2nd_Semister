 class items {
    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0;

    items(int prodId, double price, int quantity) {
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

public class t3 {
    public static void main(String[] args) {
        items[] products = new items[5];
        products[0] = new items(1, 10.5, 2);
        products[1] = new items(2, 20.0, 3);
        products[2] = new items(3, 15.75, 1);
        products[3] = new items(4, 8.99, 4);
        products[4] = new items(5, 5.25, 2);

        for (int i = 0; i < 5; i++) {
            products[i].display();
            System.out.println();
            products[i].calculateTotalPrice();
        }

        System.out.println("Total Price=" + items.totalPrice);
    }
}
