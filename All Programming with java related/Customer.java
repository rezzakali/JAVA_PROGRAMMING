class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Withdraw is processing..");

        if (this.amount < amount) {
            System.out.println("Less balance, Please deposit more money to withdraw successfully.");

            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw comleted...Visit Agan");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit is processing..");
        this.amount += amount;
        System.out.println("Deposit comleted...Visit Agan");
        notify();
    }

}

class Test {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(1000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
