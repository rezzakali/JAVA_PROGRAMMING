import java.util.Scanner;

public class justTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the second number :");
        int b = input.nextInt();
        int c = a + b;
        System.out.print(c);
        input.close();
        input1.close();

    }
}
