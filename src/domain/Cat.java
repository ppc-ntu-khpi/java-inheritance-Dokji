package domain;

public class Cat extends Predator {

    private String kind;

    public Cat(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Cat() {
        this("Fluffy",4,"just a cat");
    }

    public Cat(String name) {
        this(name,4,"just a cat");
    }
        

    public void play() {
        System.out.println("Cat is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Cat hunting for a mouse...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Cat!";
    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats meat...");
    }
    
    
}
