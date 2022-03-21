public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan  = new Vehicle(7, 80, 10);
        Vehicle sportsCar = new Vehicle(2, 60, 18);

        System.out.println("Minivan przewozi " + miniVan.passengers + " osób na odległość do " + miniVan.fuelCap / miniVan.lkm * 100 + " kilometrów.");
        System.out.println("Auto sportowe przewozi " + sportsCar.passengers + " osób na odległość do " + sportsCar.fuelCap / sportsCar.lkm * 100 + " kilometrów.");
    }
}
