package vehicle;

public class Lorry extends Vehicle implements Driveable{
    int speed = 100;
    @Override
    public String move() {
        return drive();
    }

    public int getSpeed() {
        return speed;
    }
}