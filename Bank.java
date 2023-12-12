class Bank {
    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount("A", "x", 5000, 2000);
        SavingsAccount acc2 = new SavingsAccount("B", "y", 8000);
        acc1.withdraw();
        acc1.getbalance();
        acc2.addint();
        acc2.getbalance();
    }
}

class Account {
    String name, accno;
    double balance;

    Account(String n, String acc, double bal) {
        this.name = n;
        this.accno = acc;
        this.balance = bal;
    }

    void getbalance() {
        System.out.println(balance);
    }
}

class SavingsAccount extends Account {
    double interest = 0.065;

    SavingsAccount(String n, String acc, double bal) {
        super(n, acc, bal);
    }

    void addint() {
        balance = balance + balance * interest;
    }
}

class CurrentAccount extends Account {
    int odlimit = 6000, wd;

    CurrentAccount(String n, String acc, double bal, int w) {
        super(n, acc, bal);
        this.wd = w;
    }

    void withdraw() {
        if (wd > odlimit || wd > balance) {
            System.out.println("Aukaat ke bahar hai");
        } else {
            balance = balance - wd;
        }
    }
}