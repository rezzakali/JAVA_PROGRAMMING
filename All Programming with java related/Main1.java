public class Main1 {
    int myAge;
    String myName;

    // constructor in java
    public Main1(int age, String name) {
        myAge = age;
        myName = name;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.print("My name is " + myObj.myName + "and i am " + myObj.myAge);
    }
}