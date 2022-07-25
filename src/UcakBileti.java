import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int km, yas, yon;

        double tutar = 0;

        System.out.println("Mesafeyi km turunden giriniz : ");
        km = sc.nextInt();

        System.out.println("Yasinizi giriniz : ");
        yas = sc.nextInt();

        System.out.println("Yolculuk tpinizi giriniz (1: Tek Yon, 2: Gidis - Donus) : ");
        yon = sc.nextInt();

        if(km>0 && yas>0 && (yon == 1 || yon == 2)){
            if(yon == 1)
                tutar = km * 0.10;
            else if(yon == 2)
                tutar = km * 0.10 * 2;
            if(yas<12)
                tutar = tutar * 0.50;
            else if (yas >=12 && yas <=24)
                tutar -= tutar*0.10;
            else if(yas>=65)
                tutar -= tutar * 0.30;
            if(yon == 2)
                tutar -= tutar * 0.20;
        }
        else
            System.out.println("Hatali veri girdiniz!");

        System.out.println("Toplam Tutar = " + tutar + " TL");
    }
}
