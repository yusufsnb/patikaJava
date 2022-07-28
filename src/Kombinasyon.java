import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,r, nFak=1, rFak=1, nrFak=1, c = 0;



        System.out.println("Kümenin eleman sayisi : ");
        n = sc.nextInt();
        System.out.println("Oluşturulacak eleman sayisi : ");
        r = sc.nextInt();

        for(int i=1;i<=n;i++)
            nFak *= i;
        for(int j=1;j<=r;j++)
            rFak *= j;
        for(int k=1;k<= (n-r);k++)
            nrFak *= k;

        c=nFak / (rFak * nrFak);

        System.out.println(n + " elemanli kümenin " + " elemanlı kombinasyonlarının sayısı : " + c);

    }
}
