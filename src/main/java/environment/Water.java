package environment;

import animals.Animal;
import animals.Swimmable;

public class Water extends Environment<Swimmable> {
    @Override
    public void checkTraffic() {
        for (Swimmable sw : traffic){
            sw.swim();
            if (sw instanceof Animal){
                ((Animal) sw).makeSound();
            }
        }
    }

}
