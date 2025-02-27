package com.JavaMasterclass;

public class Dog extends Animal{

    // Characteristics specifically for dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        // the above call will make dog instance using animal constructor,
        // but we have more characteristics that are needed to be added using this constructor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    /* If the above constructor is commented then it will generate an error. we can
       resolve the error in two ways:
            1. Either, create a default constructor in Animal Class
            2. Or, create a constructor in Dog Class


       'Super' is used to call the constructor of parent class.
    */


    // Behaviour or methods unique to Dogs
    private void chew(){
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called.");
        super.move(5);
        // move(5); // This statement is equivalent to upper statement, but
        // it may create problem if there is an overridden method in this class.
    }

    public void run(){
        System.out.println("Dog.run() is called.");
        move(10);
    }

    private void moveLegs(){
        System.out.println("Dog.moveLegs() is called.");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() is called.");
        moveLegs();
        super.move(speed);
    }
}
