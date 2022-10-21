import java.util.*;

public class Docks {
    Map<String, Truck> docks = new HashMap<>();

    public String getDocks() {
        String returnList = "";
        for (String x: docks.keySet()) {
            if(docks.get(x) == null) {
                returnList += x + " - Tom plats\n";
            } else {
                returnList += x + " - " + docks.get(x).getVehicle() + " [" + docks.get(x).getWeight() + "kg] " + "\n";
            }
        }
        return returnList;
    }

    public boolean isDockEmpty(String dock) {
        if(docks.get(dock) == null) {
            return true;
        } else {
            return false;
        }
    }

    public void setEmptyDock(Truck truck) {
        String returnDock = "";
        int docked = 0;
        String truckType = truck.getVehicle();
        if(truckType == "Skåpbil") {
            if(isDockEmpty("A")) {
                docks.replace("A", truck);
                System.out.println("Lastbil registrerad för kaj A");
                docked++;
            } else if(isDockEmpty("B")) {
                docks.replace("B", truck);
                System.out.println("Lastbil registrerad för kaj B");
                docked++;
            }
        }

        if(truckType == "Lätt lastbil") {
            if(isDockEmpty("A")) {
                if(truck.getWeight() < 5000) {
                    docks.replace("A", truck);
                    System.out.println("Lastbil registrerad för kaj A");
                    docked++;
                }
            } else if(isDockEmpty("C")) {
                docks.replace("C", truck);
                System.out.println("Lastbil registrerad för kaj C");
                docked++;
            } else if(isDockEmpty("D")) {
                docks.replace("D", truck);
                System.out.println("Lastbil registrerad för kaj D");
                docked++;
            }
        }

        if(truckType == "Tung lastbil") {
            if(isDockEmpty("E")) {
                docks.replace("E", truck);
                System.out.println("Lastbil registrerad för kaj E");
                docked++;
            } else if(isDockEmpty("D")) {
                if(truck.getWeight() > 9000) {
                    docks.replace("D", truck);
                    System.out.println("Lastbil registrerad för kaj D");
                    docked++;
                }
            }
        }
        if(docked == 0) {
            System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
        }
    }

    public void setToDocks(String dockName, Truck truck) {
        if(truck == null) {
            docks.put(dockName, truck);
        } else {
            System.out.println("Here");
        }
    }
}
