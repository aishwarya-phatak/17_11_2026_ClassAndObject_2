public class BankAccount {

    //data members of a class
    private int accountNumber;
    private String accountName;
    private int branchCode;
    private double balance;

    //constructors
    BankAccount(){
        IO.println("Bank Account Default Constructor is called");
        this.accountNumber = 12121;
        this.accountName = "Siddhesh";
        this.branchCode = 05;
        this.balance = 100000;
    }

    BankAccount(int accNumber, String accName, int branchCode, double balance){
        IO.println("Bank Account parameterized constructor is called");
        this.accountNumber = accNumber;
        this.accountName = accName;
        this.balance = balance;
        this.branchCode = branchCode;
    }

    //member functions of a class
    void display(){
        System.out.println("\nDisplay method of Bank Account class called");
        IO.println("\naccount number is : " + accountNumber + "\naccount name : " + accountName + "\nbalance is : " + balance + "\nbranch code : " + branchCode );
    }

    public void withdraw(double amt){
        if (amt > balance){
            IO.println("\nInsufficient balance in your account");
        }else{
            balance -= amt;
            IO.println("\nNew balance after amount withdrawal is : " + balance);
        }
    }

    public void deposit(double amt){
        balance += amt;
        IO.println("New balance after amount deposit is  : " + balance);
    }

    //methods of object class overridden
    @Override
    public String toString() {
        return "\nacc name " + accountName + "\nacc number : " + accountNumber + "\nbalance : " + balance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
