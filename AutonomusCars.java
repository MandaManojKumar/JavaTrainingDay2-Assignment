import java.util.Scanner;

class AutonomousCar {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = "";
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class AutonomusCars {
    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int sum = 0;
        for (AutonomousCar car : cars) {
            if (car.getEnvironment().equalsIgnoreCase(environment)) {
                sum += car.getNoOfTestsPassed();
            }
        }
        return sum;
    }

    public static AutonomousCar updateCarGrade(String brand, AutonomousCar[] cars) {
        for (AutonomousCar car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
                if (rating >= 80) {
                    car.setGrade("A1");
                } else {
                    car.setGrade("B2");
                }
                return car;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutonomousCar[] cars = new AutonomousCar[4];

        for (int i = 0; i < 4; i++) {
            int carId = scanner.nextInt();
            String brand = scanner.next();
            int noOfTestsConducted = scanner.nextInt();
            int noOfTestsPassed = scanner.nextInt();
            String environment = scanner.next();
            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        String searchEnvironment = scanner.next();
        String searchBrand = scanner.next();

        int totalTestsPassed = findTestPassedByEnv(cars, searchEnvironment);
        if (totalTestsPassed > 0) {
            System.out.println(totalTestsPassed);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar updatedCar = updateCarGrade(searchBrand, cars);
        if (updatedCar != null) {
            System.out.println(updatedCar.getBrand() + "::" + updatedCar.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }

        scanner.close();
    }
}
