package vehicle;

public class Van extends Vehicle implements Driveable{
    @Override
    public void move() {
        drive();
    }
}
