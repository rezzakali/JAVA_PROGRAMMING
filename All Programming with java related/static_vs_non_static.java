/**
 * static_vs_non_static
 */
public class static_vs_non_static {

    static void myStaticMethod() {
        System.out.print("Static means we can be accessed without creating the an objects");
    }

    public void myPublicMethod() {
        System.out.println();
        System.out.print("We can to accessed public method without creating an objects.");
    }

    public static void main(String[] args) {
        myStaticMethod();
        static_vs_non_static myObj = new static_vs_non_static();
        myObj.myPublicMethod();
    }
}