
public class Account_Perameterized {

    private int accntId;
    private String name;
    private double balance;

    public Account_Perameterized(int id, String str, double bl) {
        accntId = id;
        name = str;
        balance = bl;
    }

    public void showAccount() {
        System.out.println("Account id : " + accntId);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);

    }

}
