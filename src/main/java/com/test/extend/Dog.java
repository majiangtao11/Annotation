package com.test.extend;

/**
 * @author: mjt
 * time:2021-12-15
 * desription:
 */
public class Dog extends Animal {
    Dog(){
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}