import java.util.Scanner;

/**
 * First
 */
public class vowel {

    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character:");

        ch = input.next().charAt(0);
        if (ch == 'a') {
            System.out.print("Vowel");
        } else if (ch == 'e') {
            System.out.print("Vowel");
        } else if (ch == 'i') {
            System.out.print("Vowel");
        } else if (ch == 'o') {
            System.out.print("Vowel");
        } else if (ch == 'u') {
            System.out.print("Vowel");
        } else {
            System.out.print("Consonant");
        }
        input.close();
    }
}