package Week2;
import java.util.Scanner;

public class AgeCheck {
    void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you");
        int age = input.nextInt();
        if (age <= 11){
            System.out.println("You're still a kid.");
        }

        if (age >= 12 && age <= 17){
            System.out.println("Welcome, teenager!");
        }

        if (age >= 18){
            System.out.println("You're too old!");
        }
    }
}
