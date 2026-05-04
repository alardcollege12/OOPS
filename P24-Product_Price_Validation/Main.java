class Product {
    private int id;
    private String name;
    private double price;

    void set(int id, String name, double price) {
        this.id = id;
        this.name = name;
        if (price >= 0) this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.set(101, "Book", 100);
        p.display();
    }
}
