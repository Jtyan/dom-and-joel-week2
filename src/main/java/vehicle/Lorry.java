package vehicle;

public class Lorry extends Vehicle implements Driveable{
    @Override
    public void move() {
        drive();
    }
}