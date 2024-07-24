package animals;
import interfaces.Movable;

public interface Swimmable extends Movable {
    default void swim(){
        System.out.println(this.getClass().getSimpleName() + " swam!");
    }

}
