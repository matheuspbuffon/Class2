package com.matheuspbuffon;

public class Main {

    public static void main(String[] args) {

        Dog k9 = new Dog();
        Lion jungleKing = new Lion();
        Cat snowBall = new Cat();

        k9.makeSound();
        jungleKing.makeSound();
        snowBall.makeSound();

        System.out.println(Animal.legs);
    }
}
