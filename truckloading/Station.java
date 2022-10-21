import java.util.ArrayList;
import java.util.Scanner;

public class Station {
    Scanner scanner = new Scanner(System.in);
    Docks docks = new Docks();
    private String stationName;
    private int numOfDocks;

    Station(String stationName, int numOfDocks) {
        this.stationName = stationName;
        this.numOfDocks = numOfDocks;
        this.openDocks();
    }

    private void openDocks() {
        for (int i = 65; i < (65+numOfDocks); i++) {
            docks.setToDocks(Character.toString((char)i), null);
        }
    }

    public void viewDocks() {
        System.out.println(docks.getDocks());
    }

    public String getStationName() {
        return stationName;
    }

    public int getNumOfDocks() {
        return numOfDocks;
    }

    public void dockTruck() {
        System.out.println("Typ av lastbil:\n1. Skåpbil\n2. Lätt lastbil\n3. Tung lastbil");
        System.out.print("Välj från listan: ");
        int getVehicleType = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Vikt på lastbil: ");
        int getVehicleWeight = scanner.nextInt();
        scanner.nextLine();
        switch(getVehicleType) {
            case 1:
                Van van = new Van(getVehicleWeight);
                docks.setEmptyDock(van);
                break;
            case 2:
                SmallTruck smallTruck = new SmallTruck(getVehicleWeight);
                docks.setEmptyDock(smallTruck);
                break;
            case 3:
                HeavyTruck heavyTruck = new HeavyTruck(getVehicleWeight);
                docks.setEmptyDock(heavyTruck);
                break;
        }
    }
}
