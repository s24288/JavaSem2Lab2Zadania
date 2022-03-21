public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan  = new Vehicle(7, 80, 13);
        Vehicle sportsCar = new Vehicle(2, 60, 18);

        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób na odległość do " + miniVan.range() + " kilometrów.");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób na odległość do " + sportsCar.range() + " kilometrów.\n");

        System.out.println("Minivan potrzebuje " + miniVan.fuelDemand() + " litrów paliwa.");
        System.out.println("Auto sportowe potrzebuje " + sportsCar.fuelDemand() + " litrów paliwa.");
    }
}
