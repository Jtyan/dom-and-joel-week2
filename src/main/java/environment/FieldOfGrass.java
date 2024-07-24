package environment;

import animals.Animal;
import animals.Swimmable;

public class FieldOfGrass extends Environment<Animal> {
    @Override
    public void checkTraffic() {
        for (Animal a: traffic){
            if (a instanceof Swimmable){
                System.out.println("Who put this " + a.getClass().getSimpleName() + " in the field?");
            } else {
                System.out.println(a.getClass().getSimpleName() + " is in the field");
                a.makeSound();
            }
        }
    }
}
