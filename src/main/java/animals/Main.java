package animals;

import environment.Road;
import environment.Sky;
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
    sky.checkTraffic();

    System.out.println("\n");

    Road road = new Road();
    road.addTraffic(new Duck());
    road.addTraffic(new Pigeon());
    road.addTraffic(new Aeroplane());
    road.checkTraffic();
    }
}
