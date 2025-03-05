import java.util.Scanner;
public class TripCostCalculator {

    public double calculateCost(double distance, double fuelPrice) {
        double fuelNeeded = (distance / 100) * 5;
        return fuelNeeded * fuelPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TripCostCalculator calculator = new TripCostCalculator();
        System.out.println("Enter the distance in km: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter the fuel price per litre: ");
        double fuelPrice = scanner.nextDouble();
        System.out.println("The cost of the trip is: " + calculator.calculateCost(distance, fuelPrice));
    }
}
