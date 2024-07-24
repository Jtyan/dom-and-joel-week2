package vehicle;

import animals.Flyable;

public class Aeroplane extends Vehicle implements Flyable {
    int speed = 300;
    @Override
    public String move() {
        fly();
        return null;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public String getSpeed() {
        return speed + "mph";
    }
}
