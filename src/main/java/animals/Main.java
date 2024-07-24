package animals;

import vehicle.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> objects = List.of(
                new Aeroplane(),
                new Car(),
                new Pigeon(),
                new Duck(),
                new Fish()
        );

        for (Object object : objects) {

            if (object instanceof Swimmable swimmable) {
                swimmable.swim();
            }

            if (object instanceof Flyable flyable) {
                flyable.fly();
            }

            if (object instanceof Vehicle vehicle) {
                vehicle.move();
            }

        }

    }
}
