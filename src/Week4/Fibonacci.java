package Week4;
import java.util.Scanner;

public class Fibonacci {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = input.nextInt();

        int first = 0;
        int second = 1;

        while (first <= limit) {
            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}
