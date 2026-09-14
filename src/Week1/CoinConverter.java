package Week1;

public class CoinConverter {
    static void main(){
        int totalxu = 483274;
        System.out.println("483274 xu converts into:");
        int quan = totalxu / 10000;

        int remainingXu = totalxu % 10000;

        int dong = remainingXu / 100;

        remainingXu = remainingXu % 100;

        int hao = remainingXu / 10;
        remainingXu = remainingXu % 10;

        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + remainingXu + " xu");

    }
}
