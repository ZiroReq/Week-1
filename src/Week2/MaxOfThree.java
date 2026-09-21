package Week2;

public class MaxOfThree {
    static void main(){
        int a = 10;
        int b = -8;
        int c = 35;

        int Largest = a;
        if(b > Largest){
            Largest = b;
        }

        if(c > Largest){
            Largest = c;
        }
        System.out.print("Among " + a + ", " + b + " and " + c + ", the largest is " + Largest);

    }
}
