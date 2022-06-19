import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        System.out.println("Turkce notunuzu giriniz :");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz :");
        tarih = input.nextInt();
        System.out.println("Muzik notunuzu giriniz :");
        muzik = input.nextInt();
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ort = toplam / 6;

        String msj;
        msj = (ort >= 60) ? "Sinifi gecti" : "Sinifta Kaldi";

        System.out.println(msj);
    }
}
