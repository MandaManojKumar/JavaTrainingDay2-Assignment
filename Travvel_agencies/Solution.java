package Travvel_agencies;

import java.util.Scanner;

public class Solution {
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int highestPackagePrice = Integer.MIN_VALUE;
        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > highestPackagePrice) {
                highestPackagePrice = agency.getPrice();
            }
        }
        return highestPackagePrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
        for (TravelAgencies agency : agencies) {
            if (agency.isFlightFacility() &&
                agency.getRegNo() == regNo &&
                agency.getPackageType().equalsIgnoreCase(packageType)) {
                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        TravelAgencies[] agencies = new TravelAgencies[4];
        for (int i = 0; i < agencies.length; i++) {
            int regNo = Integer.parseInt(scanner.nextLine());
            String agencyName = scanner.nextLine();
            String packageType = scanner.nextLine();
            int price = Integer.parseInt(scanner.nextLine());
            boolean flightFacility = Boolean.parseBoolean(scanner.nextLine());
            agencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        // Calling static methods
        int highestPackagePrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPackagePrice);

        TravelAgencies agency = agencyDetailsForGivenIdAndType(agencies, 987, "Diamond");
        if (agency != null) {
            System.out.println(agency.getAgencyName() + ":" + agency.getPrice());
        }
    }
}

