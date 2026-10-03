package Week4;

public class ArrayPractice {
    static void main(){
        // a. Allocate an array of ten integers
        int[] numbers = new int[10];

        // b. Put 17 as the first element
        numbers[0] = 17;

        // c. Put 29 as the last element
        numbers[9] = 29;

        // d. Fill remaining elements with -1
        for (int i = 1; i < 9; i++) {
            numbers[i] = -1;
        }

        // e. Add 1 to each element
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
        }

        // f. Print each element on a separate line
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // g. Print all elements on one line, separated by commas
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
