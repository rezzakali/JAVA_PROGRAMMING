public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();

        Thread thread = new Thread(obj);

        thread.start();
        System.out.println("The code is outside the thread");
    }

    public String myName;
    public String myAge;

    public void run() {
        System.out.println("The code in running in thread");
    }
}