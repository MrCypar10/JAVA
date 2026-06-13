
public class Account_nonPermert {

    private int accntid;
    private String name;
    private double balance;

    Account_nonPermert() {
        accntid = 101;
        name = "Cypar";
        balance = 11635.3;
    }

    public void showAccount() {
        System.out.println("Account id : " + accntid);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }
}
