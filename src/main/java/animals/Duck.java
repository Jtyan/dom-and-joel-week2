package animals;

public class Duck extends Bird implements Swimmable{
    @Override
    public void makeSound() {
        System.out.println("Quacking sounds");
    }
}
