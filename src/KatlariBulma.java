import java.util.Scanner;

public class KatlariBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = 0;

        System.out.println("Bir sayi giriniz : ");
        sayi = sc.nextInt();

        for(int i=1;i<sayi;i*=4)
            System.out.println("4'ün Kati : " + i);
        for(int j=1;j<sayi;j*=5)
            System.out.println("5'in Kati : " + j);
    }
}
