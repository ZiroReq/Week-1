package Week2;

public class NumberChecker {
    static void main(){
        double number = -19999.48;
        String result = "A ";

        if (number == 0){
            System.out.println("The number is zero");
        } else {
            double abs = Math.abs(number);
            if(Math.abs(number) < 1) {
                result += "small ";
            } else if (Math.abs(number) > 1000) {
                result += "large ";
            }

            if (number > 0){
                result += "positive";
            } else{
                result += "negative";
            }

            result += " number.";
            System.out.println(result);
        }
        }
}
