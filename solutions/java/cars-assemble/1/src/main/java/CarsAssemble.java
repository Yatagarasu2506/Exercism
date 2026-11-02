public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        final int MIN_CARS_PER_HOUR = 221;
        double productionRate = speed * MIN_CARS_PER_HOUR;
        if(speed >= 1 && speed <= 4) {
            return productionRate;
        } else if (speed >= 5 && speed <= 8) {
            return (productionRate / 100 * 90);
        } else if (speed == 9) {
            return (productionRate / 100 * 80);
        } else
            return (productionRate / 100 * 77);
    }

    public int workingItemsPerMinute(int speed) {
        final int MINUTES_IN_HOUR = 60;
        return (int) productionRatePerHour(speed) / MINUTES_IN_HOUR;
    }
}
