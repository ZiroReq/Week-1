package Week4;
import java.util.Scanner;

public class ArrayPhoneBook {
    static void main(){
        Scanner input = new Scanner(System.in);

        String[] names = {
                "Ayin",
                "Buffet",
                "Rien",
                "Carmen"
        };

        String[] phoneNumbers = {
                "333-8000",
                "333-2323",
                "555-1234",
                "555-9876"
        };

        System.out.print("Enter name to look up: ");
        String search = input.nextLine();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {

            if (names[i].toLowerCase().contains(search.toLowerCase())) {

                System.out.println("A result is found for \"" + names[i] + "\".");
                System.out.println("The phone number is: " + phoneNumbers[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No result is found for \"" + search + "\".");
        }
    }
}
