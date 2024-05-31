import java.util.Scanner;

class Institution {
    private int institutionId;
    private String institutionName;
    private String noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    // Parameterized constructor
    public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    // Getters and setters
    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class InstitutionData {

    public static void main(String[] args) {
        // Create an array to hold Institution objects
        Institution[] institutions = new Institution[4];

        // Read values for Institution objects
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int institutionId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String institutionName = scanner.nextLine();
            String noOfStudentsPlaced = scanner.nextLine();
            int noOfStudentsCleared = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String location = scanner.nextLine();
            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        // Read the value for location and institutionName
        String location = scanner.nextLine();
        String institutionName = scanner.nextLine();

        // Call the methods and display the result
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

        // Close the scanner
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
