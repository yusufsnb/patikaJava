import java.util.Scanner;

public class KitleIndex {
    public static void main(String[] args) {
        double kilo, boy;
        double index;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : (, ile kg)");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz : (, ile m)");
        boy = input.nextDouble();
        index = (kilo / Math.pow(boy, 2));
        System.out.println("Vucut kitle indeksiniz :" + index);
    }
}
