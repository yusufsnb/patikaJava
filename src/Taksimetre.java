import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        float kmUcreti = 2.20f, km, acilis = 10.0f, tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilometreyi giriniz :");
        km = input.nextFloat();

        tutar = (km * kmUcreti) + acilis;
        tutar = tutar >= 20.0 ? 20 : tutar;

        System.out.println("Odenecek ucret :" + tutar);
    }
}
