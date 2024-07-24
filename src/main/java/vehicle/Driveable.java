package vehicle;
import interfaces.Movable;

public interface Driveable extends Movable {
    default String drive() {
        return this.getClass().getSimpleName() + " is driven" ;
    };

}
