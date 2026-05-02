class Account {
    private double balance;
    void deposit(double amt){
        if(amt>0) balance+=amt;
    }
    void withdraw(double amt){
        if(amt<=balance) balance-=amt;
    }
    void display(){
        System.out.println(balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Account a=new Account();
        a.deposit(1000);
        a.withdraw(500);
        a.display();
    }
}
