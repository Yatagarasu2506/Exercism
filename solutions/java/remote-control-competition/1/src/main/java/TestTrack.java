import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        Objects.requireNonNull(car, "car must not be null");
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort(Collections.reverseOrder());
        return cars;
    }
}
