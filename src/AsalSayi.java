import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int num = sc.nextInt();
        if(isPrimeNumber(num,1))
            System.out.println(num + " asal sayidir.");
        else
            System.out.println(num + " asal sayi degildir");
    }


    public static boolean isPrimeNumber(int number, int i) {

        if (number == 0 || number == 1)
            return false;
        if (number == 2)
            return true;
        else {
            if (number % i == 0) {
                if (i == 1)
                    return isPrimeNumber(number, i + 1);
                else if (number == i)
                    return true;
                else
                    return false;
            } else
                return isPrimeNumber(number, i + 1);
        }
    }
}
