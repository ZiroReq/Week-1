package Week2;
import java.util.Scanner;

public class AgeCheck {
    void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you");
        int age = input.nextInt();
        if (age <= 11){
            System.out.println("Sign up on the big stein form today");
        }

        if (age >= 12 && age <= 17){
            System.out.println("Near expiry");
        }

        if (age >= 18){
            System.out.println("Expired");
        }
    }
}
