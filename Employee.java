class Employee {
    int id = 101;
    String name = "Raton miah";

    void display() {
        System.out.println("The name of employee is " + name + " and the id is " + id);
    }
}

class Programmer extends Employee {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.display();
    }
}