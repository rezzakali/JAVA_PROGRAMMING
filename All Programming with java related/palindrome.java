import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = input.nextInt();
		int rev = 0;
		int temp = number;
		while (number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number = number / 10;
		}
		if (temp == rev) {
			System.out.print("Palindrome");
		} else {
			System.out.print("Not a palindrome");
		}
		input.close();
	}
}
