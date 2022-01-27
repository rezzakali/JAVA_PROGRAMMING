public class MethodOverloading {
    static int myMethod(int x, int y) {
        return x + y;
    }

    static double myMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.print(myMethod(12, 10));
        System.out.print("\n");
        System.out.print(myMethod(10.10, 12.12));
    }
}
