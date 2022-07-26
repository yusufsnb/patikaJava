import java.util.Scanner;

public class DonguOrtalama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sayi, toplam = 0, sayac = 0;
        System.out.println("Bir sayi giriniz : ");
        sayi = sc.nextInt();

        for(int i=0;i<sayi;i++)
            if(i%3 == 0 || i % 4 == 0){
                toplam += i;
                sayac ++;
            }
        System.out.println("Ortalama = " + (toplam / sayac));

    }
}
