import java.util.Scanner;

public class water_energy_formula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h2omass, initialTempC, finalTempC, energyNeeded;

        System.out.print("Enter the amount of water in Kg: ");
        h2omass = input.nextDouble();
        System.out.print("Enter the initial temperature in celsius: ");
        initialTempC = input.nextDouble();
        System.out.print("Enter the final temperature in celsius: ");
        finalTempC = input.nextDouble();

        energyNeeded = h2omass * (finalTempC - initialTempC) * 4184;

        System.out.print("The energy needed is: " + energyNeeded);
    }
}
