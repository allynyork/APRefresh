public class SavingsAccount {
    // instance fields
    double balance;

    // constructor method
    public SavingsAccount(double startingBalance){
        balance = startingBalance;
    }

    // deposit method
    public void deposit(double amountToDeposit){
        //Add amountToDeposit to the balance
        double updatedBalance = balance + amountToDeposit;
        balance = updatedBalance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    // check balance method
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    // withdraw method
    public double withdraw(double amountToWithdraw){
        //Subtract amountToWithdraw from the balance
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    // main method
    public static void main(String[] args){
        SavingsAccount myAccount = new SavingsAccount(2000);
        System.out.println(myAccount.balance);
        myAccount.deposit(100);
        System.out.println(myAccount.balance);
        //System.out.println(myAccount.checkBalance());
        myAccount.checkBalance();
        myAccount.deposit(123);
        myAccount.checkBalance();
        myAccount.withdraw(654);
        //myAccount.checkBalance();
        System.out.println(myAccount);
    }
    public String toString() {
        return "This is your account balance " + balance;
    }
}

// state is represented with instance fields, and behaviour is represented with methods
