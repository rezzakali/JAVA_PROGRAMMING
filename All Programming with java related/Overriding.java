class Overriding{
    void run()    {
        System.out.println("Vehicle is running.");
    }
}
class Bike extends Overriding{
    void run() {
        System.out.println("Vehicle is running safely.");
    }
    public static void main(String[] args){
        Bike obj=new Bike();
        obj.run();
    }
}