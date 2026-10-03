package Week3;
import java.util.Scanner;
public class PrimeCheck {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
