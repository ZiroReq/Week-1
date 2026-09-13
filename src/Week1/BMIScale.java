package Week1;
import java.util.Scanner;

public class BMIScale {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("BMI Scale");
        System.out.println("How much do you weigh? (in kg)");
        double weight = input.nextDouble();
        System.out.println("How tall are you? (eg: 1.60m)");
        double height = input.nextDouble();
        System.out.println("Your BMI is:");
        System.out.println("My Weight: " + weight + "kg");
        System.out.println("My Height: " + height + "m");
        double bmi = weight / Math.pow(height, 2);
        System.out.println("My BMI: " + bmi);
    }
}
