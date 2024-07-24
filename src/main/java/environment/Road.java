package environment;

public class Road extends Environment<Object>{
    @Override
    public void checkTraffic() {
        for (Object obj : traffic){
            System.out.println(obj.getClass().getSimpleName() + " is on the road NOOOO!");
        }
    }
}
