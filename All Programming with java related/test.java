class test {
    int id;
    String name;
    int age;

    test(String n, int i) {
        id = i;
        name = n;
    }

    test(String n, int a, int i) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.print("Name " + name + " and id " + id + " and age " + age);
    }

    public static void main(String[] args) {

        test t1 = new test("Rezzak", 101);
        test t2 = new test("Rezzak Ali", 102, 20);
        t1.display();
        t2.display();
    }
}