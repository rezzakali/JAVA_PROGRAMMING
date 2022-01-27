class Student {
    int id;
    String name;
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Rezzak Ali";
        System.out.println("Id is " + s1.id + " and name is " + s1.name);
    }
}