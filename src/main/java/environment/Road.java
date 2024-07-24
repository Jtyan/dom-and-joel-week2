package environment;

import animals.Flyable;
import animals.Swimmable;
import interfaces.Movable;
import vehicle.Vehicle;

public class Road extends Environment<Movable>{
    @Override
    public void checkTraffic() {
        for (Object obj : traffic){
            if (obj instanceof Vehicle && !(obj instanceof Flyable)) {
                String moving = ((Vehicle) obj).move() + ((Vehicle) obj).getSpeed();
                System.out.println(moving);
            } else {
                System.out.println(obj.getClass().getSimpleName() + " is on the road NOOOO!");
            }
        }
    }
}
