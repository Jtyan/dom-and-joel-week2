package animals;

public abstract class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("A tweeting sound from the tree");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flew through the air!");
    }
}
