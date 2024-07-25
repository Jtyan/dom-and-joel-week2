package environment;

import interfaces.Movable;

import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T extends Movable> {

    protected List<T> traffic = new ArrayList<>();
    protected int maxSpeed;
    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }

    public void checkSpeed() {
        for (Movable m : traffic) {
            m.getSpeed();
        }
    }

}
