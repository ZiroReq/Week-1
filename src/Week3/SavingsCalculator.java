package Week3;
import java.util.Scanner;

public class SavingsCalculator {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("How much money? ");
        double money = input.nextDouble();

        System.out.print("How many years do you want to deposit your money? ");
        int years = input.nextInt();

        System.out.print("What's the interest rate (%)? ");
        double interestRate = input.nextDouble();

        for (int i = 1; i <= years; i++) {
            money = money + money * (interestRate / 100);
        }

        System.out.printf("After %d years, you'll receive %.2f%n", years, money);
    }
}
