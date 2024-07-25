package vehicle;

public class Van extends Vehicle implements Driveable{
    int speed = 50;
    @Override
    public String move() {
        return drive();
    }

    public int getSpeed() {
        return speed;
    }
}
