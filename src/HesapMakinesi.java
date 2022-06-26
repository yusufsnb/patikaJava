import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int s1, s2, secim;

        Scanner sc = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz :");
        s1 = sc.nextInt();
        System.out.print("2. sayiyi giriniz :");
        s2 = sc.nextInt();

        System.out.println("Islem seciniz : 1(+), 2(-), 3(*), 4(/)");
        secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println(s1 + " + " + s2 + " = " + (s1 + s2));
                break;
            case 2:
                System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
                break;
            case 3:
                System.out.println(s1 + " * " + s2 + " = " + (s1 * s2));
                break;
            case 4:
                System.out.println(s1 + " / " + s2 + " = " + (s1 / s2));
                break;
            default:
                System.out.println("Yanlis Secim");
        }
    }
}
