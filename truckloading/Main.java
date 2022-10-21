import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endOfProgram = false;
        Station dumpaMera = new Station("Dumpa Mera", 5);
        while(!endOfProgram) {
            System.out.println("– Avlastningsstationen " + dumpaMera.getStationName() + " –");
            System.out.println("1. Se parkerade lastbilar");
            System.out.println("2. Registrera ny avlastande lastbil");
            System.out.println("3. Avsluta");
            System.out.print("Välj från lista: ");
            int menuPress = scanner.nextInt();
            scanner.nextLine();

            switch(menuPress) {
                case 1:
                    // Se parkerade bilar
                    dumpaMera.viewDocks();
                    break;
                case 2:
                    // Registrera ny avlastande lastbil
                    dumpaMera.dockTruck();
                    break;
                case 3:
                    endOfProgram = true;
                    break;
            }
        }
    }
}