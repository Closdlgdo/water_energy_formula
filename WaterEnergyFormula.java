import java.util.Scanner;

public class WaterEnergyFormula {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double waterMass, initialTempC, finalTempC, energyNeeded;
    final double SPECIFIC_HEAT_CAPACITY = 4184;
    System.out.print("Enter the mass of water in kilograms: ");
    waterMass = input.nextDouble();
    System.out.print("Enter the initial temperature of the water in Celsius: ");
    initialTempC = input.nextDouble();
    System.out.print("Enter the final temperature of the water in Celsius: ");
    finalTempC = input.nextDouble();
    input.close();

    if (waterMass <= 0) {
        System.out.println("Error: Mass of water must be positive.");
        return;
    }

    if (finalTempC < initialTempC) {
        System.out.println("Error: Final temperature cannot be lower than initial temperature.");
        return;
    }

    energyNeeded = waterMass * (finalTempC - initialTempC) * SPECIFIC_HEAT_CAPACITY;

    System.out.printf("The energy needed to heat %.2f kg of water from %.2f C to %.2f C is %.2f J.",
            waterMass, initialTempC, finalTempC, energyNeeded);
}
}
