package Week2;

import java.util.Scanner;

public class LeapYearCalc {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int cyear = input.nextInt();

        if (cyear % 4 != 0) {
            System.out.println("The year " + cyear + " is not a leap year.");
        }
        else if (cyear % 100 != 0) {
            System.out.println("The year " + cyear + " is a leap year.");
        }
        else if (cyear % 400 != 0) {
            System.out.println("The year " + cyear + " is not a leap year.");
        }
        else {
            System.out.println("The year " + cyear + " is a leap year.");
        }
    }
}