public class Throw {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote.");
        } else {
            System.out.println("Person is eligible to vote.");
        }
    }

    public static void main(String[] args) {
        validate(18);
        System.out.println("Code is rest here...");
    }
}