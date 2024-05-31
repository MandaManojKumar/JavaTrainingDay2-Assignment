package Naval_Vessel;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Read values for NavalVessel objects, percentage, and purpose
        Scanner scanner = new Scanner(System.in);
        NavalVessel[] navalVessels = new NavalVessel[4];
        for (int i = 0; i < 4; i++) {
            int vesselId = scanner.nextInt();
            String vesselName = scanner.next();
            int noOfVoyagesPlanned = scanner.nextInt();
            int noOfVoyagesCompleted = scanner.nextInt();
            String purpose = scanner.next();
            navalVessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }
        int percentage = scanner.nextInt();
        String purpose = scanner.next();

        // Call the findAvgVoyagesByPct method
        double avgVoyages = findAvgVoyagesByPct(navalVessels, percentage);
        System.out.println((int) avgVoyages); // Convert double to int

        // Call the findVesselByGrade method
        NavalVessel vessel = findVesselByGrade(navalVessels, purpose);
        if (vessel != null) {
            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

        // Close the scanner
        scanner.close();
    }

    public static double findAvgVoyagesByPct(NavalVessel[] navalVessels, int percentage) {
        int count = 0;
        int totalVoyagesCompleted = 0;
        for (NavalVessel vessel : navalVessels) {
            int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
            if (pct >= percentage) {
                totalVoyagesCompleted += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalVoyagesCompleted / count;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] navalVessels, String purpose) {
        for (NavalVessel vessel : navalVessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                if (pct == 100) {
                    vessel.setClassification("Star");
                } else if (pct >= 99 && pct <= 80) {
                    vessel.setClassification("Leader");
                } else if (pct >= 79 && pct <= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null;
    }
}
