package environment;

import animals.Flyable;

public class Sky extends Environment<Flyable> {
    @Override
    public void checkTraffic() {
        for (Flyable fl : traffic){
            System.out.println(fl.getClass().getSimpleName() + " is flying");
        }
    }
}
