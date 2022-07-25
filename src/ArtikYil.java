import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yil;

        System.out.println("Yil giriniz : ");
        yil = sc.nextInt();

        if(yil%4 == 0)
            System.out.println(yil + " bir artik yildir");
        else
            System.out.println(yil + " bir artik yil degildir!");
    }
}
