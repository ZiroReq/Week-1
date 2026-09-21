package Week2;

import java.util.Scanner;

public class EquationSolver {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a: ");
        double a = input.nextDouble();

        System.out.print("Please enter b: ");
        double b = input.nextDouble();

        System.out.print("Please enter c: ");
        double c = input.nextDouble();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("The equation has infinitely many roots.");
        }
        else if (a == 0 && b == 0) {
            System.out.println("The equation has no root.");
        }
        else if (a == 0) {
            double x = -c / b;

            System.out.println("The equation has one root:");
            System.out.println("x = " + x);
        }
        else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("The equation has no real root.");
            }
            else if (delta == 0) {
                double x = -b / (2 * a);

                System.out.println("The equation has one root:");
                System.out.println("x = " + x);
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("The equation has two roots:");
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}