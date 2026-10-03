package Week3;
import java.util.Scanner;
public class FactorialCalculator {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("What integer you want to calculate factorial for?");
        int number = input.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

