package Abstraction;

public abstract class Parent {    //Abstract class can hold Abstract and Concrete Method
    abstract void show();   //Abstract Method

    void display() {    //Concrete Method
        System.out.println("Parent display");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child show");
    }
    @Override
    void display(){
        System.out.println("Child display");
    }
}

class Main{
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.show();
        parent.display();
    }
}