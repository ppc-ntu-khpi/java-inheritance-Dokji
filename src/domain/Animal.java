package domain;
public class Animal {
    
    protected String name;

    protected int weight;

    public Animal() {
        name="Generic animal";
        weight=16;
    }
    public void eat() {
        System.out.println("Animal eating...");
    }
    public void drink() {
        System.out.println("Animal drinking...");
    }
    public void sleep() {
     System.out.println("Animal sleeping...");   
    }
    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nname:\t" + name + "\nweight:\t" + weight + " kg";
    }
    

}