interface Bank {
    double interestRate();
}
class SBI implements Bank {
    public double interestRate(){
        return 5.5;
    }
}
class HDFC implements Bank {
    public double interestRate(){
        return 6.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println(b.interestRate());
        b=new HDFC();
        System.out.println(b.interestRate());
    }
}
