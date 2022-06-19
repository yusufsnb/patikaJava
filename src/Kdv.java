import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        int tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen tutar giriniz :");
        tutar = input.nextInt();
        double kdvOrani = tutar > 1000 ? 0.08 : 0.18;
        System.out.println("Kdv'siz fiyat : " + tutar);
        System.out.println("Kdv'li fiyat : " + (tutar + (tutar*kdvOrani)));
        System.out.println("Kdv tutari : " + (tutar*kdvOrani));
    }
}
