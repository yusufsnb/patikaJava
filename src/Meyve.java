import java.util.Scanner;

public class Meyve {
    public static void main(String[] args) {
        double toplamFiyat, armut,
                elma, domates,
                muz, patlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kac kilo :");
        armut = input.nextDouble();
        System.out.print("Elma kac kilo :");
        elma = input.nextDouble();
        System.out.print("Domates kac kilo :");
        domates = input.nextDouble();
        System.out.print("Muz kac kilo :");
        muz = input.nextDouble();
        System.out.print("Patlican kac kilo :");
        patlican = input.nextDouble();

        toplamFiyat = (armut * 2.14) + (elma * 3.67) + (domates * 1.1)
                + (muz * 0.95) + (patlican * 5.0);
        System.out.println("Toplam" + toplamFiyat);

    }
}
