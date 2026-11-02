public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int unitsTravelled;

    public void drive() {
        unitsTravelled += 20;
    }

    public int getDistanceTravelled() {
        return unitsTravelled;
    }
}
