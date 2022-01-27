/**
 * Student
 */
public class Student {

    String name;
    int rollNo;
    int id;

    Student(String name, int rollNo, int id) {
        this.name = name;
        this.rollNo = rollNo;
        this.id = id;
    }

    void displayInformation() {

        System.out.println("My name is " + name + " Roll No " + rollNo + " ,and id" + id);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rezzak Ali", 101, 102);

        s1.displayInformation();
    }
}