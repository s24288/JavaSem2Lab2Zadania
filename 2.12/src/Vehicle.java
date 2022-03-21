public class Vehicle {
    private int passengers;
    private int fuelCap;
    private int lkm;

    public Vehicle(int passengers, int fuelCap, int lkm) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.lkm = lkm;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getLkm() {
        return lkm;
    }

    public void setLkm(int lkm) {
        this.lkm = lkm;
    }

    public void range() {
        System.out.println("Zasięg (km): " + fuelCap / lkm * 100 + ".");
    }


}