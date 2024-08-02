package Abstraction;

public abstract class Vehicle {
    int number;
    abstract void start();
    abstract void gearChange(int gear);
    Vehicle(){}     //We can create constructor of abstract class
}

class Car extends Vehicle{
    @Override
    void start() { System.out.println("Car start with key"); }
    @Override
    void gearChange(int gear) { System.out.println("Gear changed"+gear); }
}

class Bike extends Vehicle{
    void start(){ System.out.println("Bike start with kick"); }
    void gearChange(int gear){ System.out.println("Gear changed:"+gear); }
}

//class Main {
//    public static void main(String[] args) {
//        Vehicle Tesla_Model_B = new Bike();
//        Tesla_B.start();
//
//        Vehicle Tesla_Mode_X = new Car();
//        Tesla_Mode_X.start();
//    }
//}


