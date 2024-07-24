package animals;

import environment.*;
import vehicle.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    Sky sky = new Sky();
    sky.addTraffic(new Duck());
    sky.addTraffic(new Pigeon());
    sky.addTraffic(new Aeroplane());

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

    FieldOfGrass field = new FieldOfGrass();
    field.addTraffic(new Duck());
    field.addTraffic(new Deer());

    List<Environment<?>> environments = List.of(sky, road, water, field);

    for (Environment<?> environment: environments) {
        System.out.println("What's going on in the " + environment.getClass().getSimpleName() + "?");
        environment.checkTraffic();
        System.out.println("************************");
    }

    }

}
