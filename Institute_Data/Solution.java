package Institute_Data;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Institution[] institutions = new Institution[4];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int institutionId = scanner.nextInt();
            scanner.nextLine(); 
            String institutionName = scanner.nextLine();
            String noOfStudentsPlaced = scanner.nextLine();
            int noOfStudentsCleared = scanner.nextInt();
            scanner.nextLine(); 
            String location = scanner.nextLine();
            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }


        String location = scanner.nextLine();
        String institutionName = scanner.nextLine();


        int numClearance = findNumClearancedByLoc(institutions, location);
        if (numClearance > 0) {
            System.out.println(numClearance);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution updatedInstitution = updateInstitutionGrade(institutions, institutionName);
        if (updatedInstitution != null) {
            System.out.println(updatedInstitution.getInstitutionName() + "::" + updatedInstitution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }


        scanner.close();
    }

    public static int findNumClearancedByLoc(Institution[] institutions, String location) {
        int totalClearance = 0;
        for (Institution institution : institutions) {
            if (institution.getLocation().equalsIgnoreCase(location)) {
                totalClearance += institution.getNoOfStudentsCleared();
            }
        }
        return totalClearance;
    }

    public static Institution updateInstitutionGrade(Institution[] institutions, String institutionName) {
        for (Institution institution : institutions) {
            if (institution.getInstitutionName().equalsIgnoreCase(institutionName)) {
                int rating = (Integer.parseInt(institution.getNoOfStudentsPlaced()) * 100) / institution.getNoOfStudentsCleared();
                if (rating >= 80) {
                    institution.setGrade("A");
                } else {
                    institution.setGrade("B");
                }
                return institution;
            }
        }
        return null;
    }
}
