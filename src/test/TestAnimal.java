package test;

import domain.Fox;

public class TestAnimal {
    
    public static void main(String[] args) {
        Fox fox= new Fox("Kalista");
        System.out.println(fox);
        fox.hunt();
        fox.eat();
        fox.drink();
        fox.speak();
        fox.mark();
        fox.sleep();
        fox.play();
        fox.walk();
    }

}