public class Bank {

    // Shared balance (static = class variable)
    private static int balance = 0;

    // Deposit method
    public void deposit() {
        balance += 100;
    }

    // Withdraw method
    public void withdraw() {
        balance -= 100;
    }

    // Get balance value
    public int getValue() {
        return balance;
    }

    // Without Lock 
    // public void run() {
    //     deposit();
    //     System.out.println(
    //         "\nValue for Thread after deposit "
    //         + Thread.currentThread().getName()
    //         + " " + getValue()
    //     );

    //     withdraw();
    //     System.out.println(
    //         "\nValue for Thread after withdraw "
    //         + Thread.currentThread().getName()
    //         + " " + getValue()
    //     );
    // }

    // Lock
    public synchronized void run() {
        deposit();
        System.out.println("Value for Thread after deposit "
            + Thread.currentThread().getName() + " " + getValue());

        withdraw();
        System.out.println("Value for Thread after withdraw "
            + Thread.currentThread().getName() + " " + getValue());
    }

}
