import java.util.Scanner;

public class Ciftve4KatToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toplam = 0, deger=0;

        do{
            System.out.println("Bir sayi giriniz");
            deger = sc.nextInt();
            if(deger % 4 == 0)
                toplam += deger;
        }while(deger % 2 == 0);

        System.out.println("Toplam : " + toplam);
    }
}
