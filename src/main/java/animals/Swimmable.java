package animals;

public interface Swimmable {
    default void swim(){
        System.out.println(this.getClass().getSimpleName() + " swam!");
    }
}
