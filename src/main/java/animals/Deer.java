package animals;

public class Deer extends Animal implements Walkable{
    int speed = 30;
    @Override
    public void makeSound() {
        System.out.println("The deer was very quiet");
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
