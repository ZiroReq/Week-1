package Week2;

public class NumberChecker {
    static void main(){
        double number = 9.75;
        if (number == 0){
            System.out.println("The number is zero");

        } else {
            String result = "A ";
            double abs = Math.abs(number);
        }

        if(Math.abs(number) < 1) {
//            result += "small";
        } else if (Math.abs(number) > 1000) {
//            result += " large";
        }

//        System.out.println(result);
    }
}
