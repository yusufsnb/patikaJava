import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;

        double alanKare;
        Scanner input = new Scanner(System.in);

        System.out.println("1. kenari giriniz :");
        kenar1 = input.nextInt();
        System.out.println("2. kenari giriniz :");
        kenar2 = input.nextInt();
        System.out.println("3. kenari giriniz :");
        kenar3 = input.nextInt();

        double u = (kenar1 + kenar2 + kenar3)/2;

        alanKare = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        System.out.println("Ucgenin alani :" + Math.sqrt(alanKare));
    }
}
