//Write a class for “Account” containing data members ‘accountNumber’, ‘holderName’, ‘balance’ and add constructors and necessary accessor/modifier functions for these data members. Now create two class “SavingsAccount” and “CurrentAccount” extending from this class. SavingsAccount will have a member variable ‘interestRate’ and member function ‘calculateYearlyInterest’. Write another class “Manager” that contains a list Account. Also write a main() function to create an instance of Manager class. Add two SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print the details of all accounts.

public class Account {
    public int accountNumber;
    public String holderName;
    public int balance;

    public Account(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        
        SavingsAccount s1 = new SavingsAccount(2, "h2", 1000, 5);
        SavingsAccount s2 = new SavingsAccount(3, "h3", 2000,  1);
        CurrentAccount c1 = new CurrentAccount(4, "h4", 3000);
        CurrentAccount c2 = new CurrentAccount(5, "h5", 4000);
        CurrentAccount c3 = new CurrentAccount(6, "h6", 5000);

        Manager m = new Manager();
       
        m.addAccount(s1);
        m.addAccount(s2);
        m.addAccount(c1);
        m.addAccount(c2);
        m.addAccount(c3);

        m.printAccountDetails();

        System.out.println("Yearly Interest for s1: " + s1.calculateYearlyInterest());
        System.out.println("Yearly Interest for s2: " + s2.calculateYearlyInterest());
    }
}

class SavingsAccount extends Account {
    public int interestRate;

    public SavingsAccount(int accountNumber, String holderName, int balance, int interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public int calculateYearlyInterest() {
        return getBalance() * interestRate;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String holderName, int balance) {
        super(accountNumber, holderName, balance);
    }
}

class Manager {
    public Account[] accounts;
    public int currentIndex = 0;

    public Manager() {
        accounts = new Account[5]; 
    }

    public void addAccount(Account account) {
        
            accounts[currentIndex++] = account;
        
    }

    public void printAccountDetails() {
        for (int i = 0; i < currentIndex; i++) {
            accounts[i].print();
            System.out.println();
        }
    }
}
