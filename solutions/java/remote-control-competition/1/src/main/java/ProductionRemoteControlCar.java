class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int unitsTravelled;
    private int numberOfVictories;

    public void drive() {
        unitsTravelled += 10;
    }

    public int getDistanceTravelled() {
        return unitsTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(this.numberOfVictories, o.getNumberOfVictories());
    }

}
