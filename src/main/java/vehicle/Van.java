package vehicle;

public class Van extends Vehicle implements Driveable{
    int speed = 100;
    @Override
    public String move() {
        drive();
        return null;
    }

    public String getSpeed() {
        return speed + "mph";
    }
}
