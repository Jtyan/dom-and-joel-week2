package animals;

public class Duck extends Bird implements Swimmable{
    int speed = 14;
    @Override
    public void makeSound() {
        System.out.println("Quacking sounds");
    }

    public int getSpeed() {
        return speed;
    }
}
