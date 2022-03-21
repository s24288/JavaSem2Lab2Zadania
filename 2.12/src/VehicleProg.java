public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan  = new Vehicle(7, 80, 10);
        Vehicle sportsCar = new Vehicle(2, 60, 18);

        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób.");
        miniVan.range();

        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób.");
        sportsCar.range();

    }
}
