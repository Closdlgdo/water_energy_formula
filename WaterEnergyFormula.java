import java.util.Scanner;

public class WaterEnergyFormula {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //declares four double variables that will be used to store the mass of water, initial temperature, final temperature, and energy needed to heat the water.
    double waterMass, initialTempC, finalTempC, energyNeeded;
    final double SPECIFIC_HEAT_CAPACITY = 4184;
    //declares a constant SPECIFIC_HEAT_CAPACITY and initializes it to the specific heat capacity of water, which is 4184 J/(kg*C).
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
    //calculates the energy needed to heat the water using the formula Q = m*c*ΔT, where Q is the energy needed, m is the mass of water, c is the specific heat capacity of water, and ΔT is the change in temperature.

    System.out.printf("The energy needed to heat %.2f kg of water from %.2f C to %.2f C is %.2f J.",
            waterMass, initialTempC, finalTempC, energyNeeded);
}
}
