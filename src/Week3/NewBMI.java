package Week3;
import java.util.Scanner;
public class NewBMI {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        bmi = Math.round(bmi * 100.0) / 100.0;

        System.out.println("Your BMI: " + bmi + " (kg/m2)");
    }
}

