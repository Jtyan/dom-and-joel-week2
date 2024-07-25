package environment;

import animals.Flyable;
import interfaces.Movable;
import vehicle.Vehicle;

public class Road extends Environment<Movable>{
    public Road() {
        maxSpeed = 80;
    }
    @Override
    public void checkTraffic() {
        for (Object obj : traffic){
            if (obj instanceof Vehicle && !(obj instanceof Flyable)) {
                int speed =  (((Vehicle) obj).getSpeed());
                if (speed > maxSpeed) {
                    String moving = ((Vehicle) obj).move() + " at " + speed + "mph. It's TOO FAST!!";
                    System.out.println(moving);
                } else {
                    String moving = ((Vehicle) obj).move() + " at " + speed + "mph";
                    System.out.println(moving);
                }
            } else {
                System.out.println(obj.getClass().getSimpleName() + " is on the road NOOOO!");
            }
        }
    }
}
