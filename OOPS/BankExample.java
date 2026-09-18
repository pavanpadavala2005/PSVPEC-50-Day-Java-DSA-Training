class BankAccount {
    String name;
    int accNum;
    String ifscCode;
    private int balance;
    private int pin;

    public BankAccount(String name, int accNum, String ifscCode, int balance, int pin) {
        this.name = name;
        this.accNum = accNum;
        this.ifscCode = ifscCode;
        this.balance = balance;
        this.pin = pin;
    }

    public int getBlance(int userPin) {
        if (userPin != this.pin) {
            return -1;
        }
        return this.balance;
    }

    public void depositeAmount(int amount, int pin) {
        if (pin == this.pin) {
            this.balance += amount;
            System.out.println("Amount Added Succesfully Balance : " + this.balance);
        } else {
            System.out.println("Incorect Pin");
        }
    }

    public void withdrrawAmount(int amount, int pin) {
        if (pin == this.pin) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Amount withdraw Succesfylly Remaing : " + this.balance);
            } else {
                System.out.println("Insuficent balanace");
            }
        } else {
            System.out.println("Incorect pin");
        }

    }

    public void showDetails() {
        System.out.println("name : " + this.name);
        System.out.println("accNum : " + this.accNum);
        System.out.println("ifscCode : " + this.ifscCode);
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Pavan", 123456, "SBIN0001943", 1000, 1234);
        b1.showDetails();
        b1.depositeAmount(100, 1234);
        b1.depositeAmount(100, 1234);
        b1.depositeAmount(100, 1235);
        System.out.println(b1.getBlance(1234));

        b1.withdrrawAmount(500, 1235);
    }
}
