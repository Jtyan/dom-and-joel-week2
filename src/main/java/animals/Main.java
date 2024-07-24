package animals;

import environment.*;
import vehicle.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Object> objects = List.of(
//                new Aeroplane(),
//                new Car(),
//                new Pigeon(),
//                new Duck(),
//                new Fish()
//        );
//
//        for (Object object : objects) {
//
//            if (object instanceof Swimmable swimmable) {
//                swimmable.swim();
//            }
//
//            if (object instanceof Flyable flyable) {
//                flyable.fly();
//            }
//
//            if (object instanceof Vehicle vehicle) {
//                vehicle.move();
//            }
//
//        }
    Sky sky = new Sky();
    sky.addTraffic(new Duck());
    sky.addTraffic(new Pigeon());
    sky.addTraffic(new Aeroplane());


    System.out.println("\n");

    Road road = new Road();
    road.addTraffic(new Duck());
    road.addTraffic(new Pigeon());
    road.addTraffic(new Aeroplane());
    road.addTraffic(new Car());
    road.addTraffic(new Van());
    road.addTraffic(new Lorry());


    Water water = new Water();
    water.addTraffic(new Duck());
    water.addTraffic(new Fish());

    List<Environment<?>> environments = List.of(sky, road, water);

    for (Environment<?> environment: environments) {
        environment.checkTraffic();
    }

    }

}
