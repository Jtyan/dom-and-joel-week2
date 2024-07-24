package environment;

import animals.Swimmable;

public class Water extends Environment<Swimmable> {
    @Override
    public void checkTraffic() {
        for (Swimmable sw : traffic){
            System.out.println(sw.getClass().getSimpleName() + " is swimming");
        }
    }
}
