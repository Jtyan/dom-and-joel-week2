package vehicle;

public class Car extends Vehicle implements Driveable{
    int speed = 120;
    @Override
    public String move() {
        return drive();
    };
    public int getSpeed() {
        return speed ;
    }
}
