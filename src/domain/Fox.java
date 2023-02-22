package domain;
public class Fox extends Predator {

    private String kind;
    
    public Fox(String name,int weight,String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Fox() {
        this("Jeki",15,"GreyFox");
    }

    public Fox(String name) {
        this(name,15,"GreyFox");
    }
    
    public void play() {
        System.out.println("Fox is playing...");
    }
    public void mark() {
        System.out.println("Fox is marking...");
      
    }
    
    public void walk() {
        System.out.println("Fox is walking...");
    }

    @Override
    public void hunt() {
        System.out.println("Fox hunting for a rabbit"); 
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Fox!!!"; 
    }

    @Override
    public void speak() {
        System.out.println("Fox speaking: Ehehehehehe-ehehehehe-uahahahahaha... :D"); 
    }

    @Override
    public void sleep() {
        System.out.println("Fox sleeping...");
    }

    @Override
    public void drink() {
        System.out.println("Fox drinking water...");
    }

    @Override
    public void eat() {
       System.out.println("Fox eats meat...");
    }

}