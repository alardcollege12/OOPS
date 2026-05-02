interface Printable {
    void print();
}
class Document implements Printable {
    public void print(){
        System.out.println("Document printed");
    }
}
class Image implements Printable {
    public void print(){
        System.out.println("Image printed");
    }
}
public class Main {
    public static void main(String[] args) {
        Printable p;
        p=new Document();
        p.print();
        p=new Image();
        p.print();
    }
}
