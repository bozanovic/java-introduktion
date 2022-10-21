public abstract class Truck {
    private int weight;
    private String vehicle;

    public Truck(int weight, String vehicle) {
        this.vehicle = vehicle;
        this.weight = weight;
    }

    public String getVehicle() {
        return this.vehicle;
    }

    public int getWeight() {
        return this.weight;
    }
}
