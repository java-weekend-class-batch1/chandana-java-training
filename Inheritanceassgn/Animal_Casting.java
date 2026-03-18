package com.training.Inheritanceassgn;
import java.util.*;

// Base class
class Animal {

    public void speak() {
        System.out.println("Animal makes a sound");
    }

    public void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Bird extends Animal {

    @Override
    public void speak() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    public void fly() {
        System.out.println("Bird is flying high");
    }
}

public class Animal_Casting {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());   // Dog → Animal
        animals.add(new Bird());  // Bird → Animal
        System.out.println("Polymorphic behavior:");
        for (Animal a : animals) {
            a.speak();   
            a.move();
        }

        System.out.println("\nSafe Downcasting using instanceof:");

        for (Animal a : animals) {

            if (a instanceof Dog) {
                Dog d = (Dog) a;   
                d.fetch();
            } else if (a instanceof Bird) {
                Bird b = (Bird) a; 
                b.fly();
            }
        }

        System.out.println("\nClassCastException Demo:");

        try {
            Animal a = new Dog();
            Bird b = (Bird) a;  
            b.fly();

        } catch (ClassCastException e) {
            System.out.println("Caught Exception: " + e);
        }

        System.out.println("\nCorrect way to avoid exception:");

        Animal a2 = new Dog();

        if (a2 instanceof Bird) {
            Bird b2 = (Bird) a2;
            b2.fly();
        } else {
            System.out.println("Cannot cast Dog to Bird");
        }
    }
}