package Fitness.TDEE;

import java.util.Scanner;

public class TDEECalculator {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input weight in kilograms
		        System.out.print("Input your weight in kilograms: ");
		        int weight = scanner.nextInt();

		        // Input height in centimeters
		        System.out.print("Input your height in centimeters: ");
		        int height = scanner.nextInt();

		        // Input activity level
		        System.out.print("What is your activity level (Sedentary, LightlyActive, ModeratelyActive, VeryActive, SuperActive)? ");
		        String activityLevel = scanner.next();

		        // Calculate BMR (Basal Metabolic Rate)
		        double bmr = calculateBMR(weight, height);

		        // Calculate TDEE (Total Daily Energy Expenditure) based on activity level
		        double tdee = calculateTDEE(bmr, activityLevel);

		        // Display the result
		        if (tdee > 0) {
		            System.out.printf("Your daily calories is: %.0f%n", tdee);
		        } else {
		            System.out.println("Please choose a valid activity level: Sedentary, LightlyActive, ModeratelyActive, VeryActive, SuperActive.");
		        }
		    }

		    /**
		     * Calculate Basal Metabolic Rate (BMR) using the Mifflin-St Jeor Equation.
		     */
		    private static double calculateBMR(int weight, int height) {
		        return 88.362 + (13.397 * weight) + (4.799 * height);
		    }

		    /**
		     * Calculate Total Daily Energy Expenditure (TDEE) based on activity level.
		     */
		    private static double calculateTDEE(double bmr, String activityLevel) {
		        switch (activityLevel) {
		            case "Sedentary":
		                return bmr * 1.2;
		            case "LightlyActive":
		                return bmr * 1.375;
		            case "ModeratelyActive":
		                return bmr * 2.0;
		            case "VeryActive":
		                return bmr * 1.725;
		            case "SuperActive":
		                return bmr * 1.9;
		            default:
		                return -1;
		        }
		    }
}
