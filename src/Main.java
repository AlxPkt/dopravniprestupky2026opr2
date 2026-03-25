import java.util.List;

public class Main {
    public static void main(String[] args) {

        FineManager policeTablet = new FineManager();

        Location cityCenter = new Location("Centrum města");
        cityCenter.addSign(new ProhibitorySign("Zákaz parkování", Action.PARKING));
        cityCenter.addSign(new SpeedLimitSign("Maximální rychlost 50", 50));

        Location highway = new Location("Dálnice D1");
        highway.addSign(new SpeedLimitSign("Maximální rychlost 130", 130));


        Car pirat = new Car("1A1-1111", Action.DRIVING_STRAIGHT, 80);
        Car spacak = new Car("2B2-2222", Action.PARKING, 0);
        Car slusnyRidic = new Car("3C3-3333", Action.DRIVING_STRAIGHT, 40);
        Car rychlik = new Car("4D4-4444", Action.DRIVING_STRAIGHT, 150);

        System.out.println("=== ZAHÁJENÍ KONTROLY: " + cityCenter.getName() + " ===");
        printFines(pirat, cityCenter, policeTablet);
        printFines(spacak, cityCenter, policeTablet);
        printFines(slusnyRidic, cityCenter, policeTablet);

        System.out.println("\n=== ZAHÁJENÍ KONTROLY: " + highway.getName() + " ===");
        printFines(rychlik, highway, policeTablet);
    }


    private static void printFines(Car car, Location location, FineManager manager) {
        System.out.println("Kontroluji auto: " + car.getPlateNumber() + " (Akce: " + car.getCurrentAction() + ", Rychlost: " + car.getCurrentSpeed() + " km/h)");


        List<String> fines = manager.checkOffenses(car, location);

        if (fines.isEmpty()) {
            System.out.println(" -> Vše v pořádku, bez pokuty.");
        } else {
            for (String fine : fines) {
                System.out.println(" -> " + fine);
            }
        }
    }
}
