package Week4;

public class ReverseStringArray {
    static void main(){
        String[] names = {"Hollow", "Gaze", "Un", "Deux", "Trois"};

        // Print original array
        System.out.println("Original array:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Reverse the array
        for (int i = 0; i < names.length / 2; i++) {

            String temp = names[i];

            names[i] = names[names.length - 1 - i];

            names[names.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("\nReversed array:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
