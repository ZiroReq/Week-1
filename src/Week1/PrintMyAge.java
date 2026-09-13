package Week1;
import java.util.Scanner;

public class PrintMyAge {

    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("When were you born?");
        int yr = input.nextInt();
        System.out.println("I was born in " + yr + ". " + "It is 2026.");
        int age = 2026 - yr;
        System.out.println("Therefore, i am " + age + " years old.");
    }
}
