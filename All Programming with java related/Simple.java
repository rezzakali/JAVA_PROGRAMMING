import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int number = input.nextInt();
            String output = (number % 2 == 0) ? "Even number" : "Odd number";
            System.out.print(output);
        }
    }

}