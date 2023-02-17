package test;

import domain.Cat;

public class TestAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat("Thomas");
        System.out.println(cat);
        cat.hunt();
        cat.eat();
        cat.speak();
        cat.play();
    }
}
