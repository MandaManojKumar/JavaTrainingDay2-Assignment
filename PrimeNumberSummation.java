import java.util.*;

public class PrimeNumberSummation {
    

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        String input = scanner.nextLine();
        
        input = input.substring(0, input.length() - 1);
        
        String[] numbers = input.split(" ");
        
        List<Integer> primeNumbers = new ArrayList<>();
        
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }
        
        int totalPrimes = primeNumbers.size();
        
        Collections.sort(primeNumbers);
        int secondLargestPrime = primeNumbers.get(totalPrimes - 2);
        
        int result = totalPrimes + secondLargestPrime;
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
