package gaurav.javacore.lab4.exp1;

import java.util.concurrent.atomic.AtomicInteger;

class Person {
    private String name;
    private Account account;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

class Account {
    private static final AtomicInteger accountNumGenerator = new AtomicInteger(0);
    private int accountNum;
    private double balance;

    public Account(double initialBalance) {
        this.accountNum = accountNumGenerator.incrementAndGet();
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return balance;
        }
        balance -= amount;
        return balance;
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) < minimumBalance) {
            System.out.println("Withdrawal denied: Minimum balance must be maintained.");
            return getBalance();
        }
        return super.withdraw(amount);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw(double amount) {
        if (getBalance() + overdraftLimit < amount) {
            System.out.println("Withdrawal denied: Overdraft limit reached.");
            return getBalance();
        }
        return super.withdraw(amount);
    }
}

public class ExerciseOne {
    public static void main(String[] args) {
        SavingsAccount smithAccount = new SavingsAccount(2000);
        CurrentAccount kathyAccount = new CurrentAccount(3000, 1000);

        Person smith = new Person("Smith", smithAccount);
        Person kathy = new Person("Kathy", kathyAccount);

        smith.getAccount().deposit(2000);
        kathy.getAccount().withdraw(2000);

        System.out.println("Smith's updated balance: " + smith.getAccount().getBalance());
        System.out.println("Kathy's updated balance: " + kathy.getAccount().getBalance());
    }
}
