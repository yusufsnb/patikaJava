import java.util.Scanner;

public class OrtalamHesaplama {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik, toplam;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        mat = mat>100 || mat < 0 ? 0 : mat;

        System.out.println("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        fizik = fizik>100 || fizik < 0 ? 0 : fizik;

        System.out.println("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        kimya = kimya>100 || kimya < 0 ? 0 : kimya;

        System.out.println("Turkce notunuzu giriniz :");
        turkce = input.nextInt();
        turkce = turkce>100 || turkce < 0 ? 0 : turkce;

        System.out.println("Muzik notunuzu giriniz :");
        muzik = input.nextInt();
        muzik = muzik>100 || muzik < 0 ? 0 : muzik;

        toplam = mat + fizik + kimya + turkce + muzik;

        ort = toplam / 5;

        if(ort >= 55)
            System.out.println("Sınifi Gecti Ortalama :" + ort);
        else
            System.out.println("Sinifta Kaldi Ortalama :" + ort);


    }
}
