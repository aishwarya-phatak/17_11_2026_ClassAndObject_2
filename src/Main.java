//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount();
        bankAccount.display();
        bankAccount.deposit(3423.23);
        bankAccount.withdraw(76423.233);

        BankAccount bAcc = new BankAccount(13241,
                "Mayur",
                34,
                1399923.2223);
        bAcc.display();
        bAcc.deposit(89823.2);
        bAcc.withdraw(32312.12);
    }
}

//new way in new version , but existing still remains
//void main() {
//
//
//}