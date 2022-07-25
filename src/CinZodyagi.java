import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yil, kalan;
        System.out.println("Dogum yiliniz : ");
        yil = sc.nextInt();

        kalan = yil % 12 ;

        if(kalan == 0)
            System.out.println("Maymun");
        else if (kalan == 1)
            System.out.println("Horoz");
        else if (kalan == 2)
            System.out.println("Kopek");
        else if (kalan == 3)
            System.out.println("Domuz");
        else if (kalan == 4)
            System.out.println("Fare");
        else if (kalan == 5)
            System.out.println("Okuz");
        else if (kalan == 6)
            System.out.println("Kaplan");
        else if (kalan == 7)
            System.out.println("Tavsan");
        else if (kalan == 8)
            System.out.println("Ejderha");
        else if (kalan == 9)
            System.out.println("Yilan");
        else if (kalan == 10)
            System.out.println("At");
        else if (kalan == 11)
            System.out.println("Koyun");
        else
            System.out.println("hatali yil girdiniz");
    }
}
