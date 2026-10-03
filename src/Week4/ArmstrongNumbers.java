package Week4;

public class ArmstrongNumbers {
    static void main(){
        for (int number = 100; number <= 999; number++) {

            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;

            int sum = hundreds * hundreds * hundreds
                    + tens * tens * tens
                    + ones * ones * ones;

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
