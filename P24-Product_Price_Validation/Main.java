class Product {
    private int id;
    private String name;
    private double price;
    void setPrice(double price){
        if(price>=0) this.price=price;
    }
    void display(){
        System.out.println(id+" "+name+" "+price);
    }
}
public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        p.setPrice(100);
        p.display();
    }
}
