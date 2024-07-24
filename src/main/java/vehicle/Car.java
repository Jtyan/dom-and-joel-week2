package vehicle;

public class Car extends Vehicle implements Driveable{
    int speed = 120;
    @Override
    public String move() {
        drive();

        return null;
    };
    public String getSpeed() {
        return speed + "mph";
    }
}
