import java.util.Scanner;

public class Siralama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer s1,s2,s3;

        System.out.println("1. sayiyi giriniz :");
        s1 = sc.nextInt();
        System.out.println("2. sayiyi giriniz :");
        s2 = sc.nextInt();
        System.out.println("3. sayiyi giriniz :");
        s3 = sc.nextInt();

        if(s1>s2 && s2>s3)
            System.out.println(s1 + ">" + s2 + ">" + s3);
        else if (s1>s3 && s3>s2)
            System.out.println(s1 + ">" + s3 + ">" + s2);
        else if (s2>s1 && s1>s3)
            System.out.println(s2 + ">" + s1 + ">" + s3);
        else if (s2>s3 && s3>s1)
            System.out.println(s2 + ">" + s3 + ">" + s1);
        else if (s3>s1 && s1>s2)
            System.out.println(s3 + ">" + s1 + ">" + s2);
        else if (s3>s2 && s2>s1)
            System.out.println(s3 + ">" + s2 + ">" + s1);
    }
}
