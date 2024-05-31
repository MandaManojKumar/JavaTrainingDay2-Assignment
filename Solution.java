import java.util.*;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;


    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }


    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

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
