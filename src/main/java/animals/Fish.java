package animals;

public class Fish extends Animal implements Swimmable{
    private final int speed = 10;
    @Override
    public void makeSound() {
        System.out.println("A weird bubbling sound");
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " didn't feel like swimming");;
    }

    @Override
    public String getSpeed() {
        return speed + "mph";
    }
}
