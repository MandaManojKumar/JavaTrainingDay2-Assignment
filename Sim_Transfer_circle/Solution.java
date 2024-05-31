package Sim_Transfer_circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
        List<Sim> result = new ArrayList<>();
        for (Sim sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                sim.setCircle(circle2);
                result.add(sim);
            }
        }
        Collections.sort(result, Comparator.comparingDouble(Sim::getRatePerSecond).reversed());
        return result.toArray(new Sim[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Sim[] sims = new Sim[5];
        for (int i = 0; i < sims.length; i++) {
            int simId = Integer.parseInt(scanner.nextLine());
            String customerName = scanner.nextLine();
            double balance = Double.parseDouble(scanner.nextLine());
            double ratePerSecond = Double.parseDouble(scanner.nextLine());
            String circle = scanner.nextLine();
            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }
        String circle1 = scanner.nextLine();
        String circle2 = scanner.nextLine();

        Sim[] result = transferCircle(sims, circle1, circle2);


        for (Sim sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
        }
    }
}