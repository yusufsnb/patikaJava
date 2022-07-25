import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer sicaklik;

        System.out.println("Lutfen sicaklik giriniz : ");
        sicaklik = sc.nextInt();

        if(sicaklik < 5 )
            System.out.println("Kayak yapabilirsiniz");
        else if (sicaklik >=5 && sicaklik<15)
            System.out.println("Sinemaya gidebilirsiniz");
        else if (sicaklik >=15 && sicaklik<25)
            System.out.println("Piknik'e gidebilirsiniz");
        else if (sicaklik > 25)
            System.out.println("Yuzme'ye gidebilirsiniz");
    }
}
