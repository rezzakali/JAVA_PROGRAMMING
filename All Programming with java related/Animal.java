public class Animal {
    void eat() {
        System.out.print("\n");
        System.out.print("Eating........");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.print("Barking....");
    }
}

class BadyDog extends Dog {
    void weep() {
        System.out.println("\n");
        System.out.print("Weeping.......");
    }

    public static void main(String[] args) {

        BadyDog d = new BadyDog();
        d.eat();
        d.bark();
        d.weep();
    }
}
