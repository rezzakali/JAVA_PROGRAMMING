class Demo {
    String name;
    int age;
    String address;
    String hobby;
    String profession;
    String skill;
    int bankBalance;

    void insertData(String n, int a, String add, String h, String p, String s, int b) {
    name=n;
      age=a;
        address=add;
       hobby=h;
       profession=p;
       skill=s;
        bankBalance=b;
    }

    void displayInformation() {
        System.out.println("Your name : " + name);
        System.out.println("Your age : " + age);
        System.out.println("Your address : " + address);
        System.out.println("Your hobby : " + hobby);
        System.out.println("Your profession : " + profession);
        System.out.println("Your skill : " + skill);
        System.out.println("Your Balance : " + bankBalance);
    }

    public static void main(String[] args) {
        Demo user1 = new Demo();
        user1.insertData("Rezzak Ali ", 20, " Dharai ", "Doctor", "Student", "HTML", 20000);

        user1.displayInformation();
    }

}