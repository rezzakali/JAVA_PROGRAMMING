public class theread extends Thread {
    public void run() {
        System.out.println("The code is running!");
    }

    public static void main(String[] args) {
        theread t = new theread();
        t.start();
        System.out.println("The code is outside running");
    }
}
