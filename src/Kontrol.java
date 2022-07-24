import java.util.Scanner;

public class Kontrol {

    public static void main(String[] args) {
        String sifre = "123abc", yeniSifre, soru;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sifrenizi sifirlamak istiyormusunuz?(E/H)");
        soru = sc.nextLine();
        if (soru.equals("E")) {
            System.out.println("Yeni sifrenizi giriniz : ");
            yeniSifre = sc.nextLine();
            if (sifre.equals(yeniSifre))
                System.out.println("Sifreniz eski sifreyle ayni olamaz");
            else {
                sifre = yeniSifre;
                yeniSifre = "";
                System.out.println("Sifreniz basariyla degistirilmistir");
            }
        }
        else
            System.out.println("Sifreniz degistirilmedi!!!");

    }
}
