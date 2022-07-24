import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        float pi = 3.14f, yaricap, aci;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaricapi giriniz :");
        yaricap = input.nextFloat();

        System.out.println("Yaricapi " + yaricap + " olan dairenin alani" +
                (pi * Math.pow(yaricap, 2)) + " cevresi" + (2 * pi * yaricap));

        System.out.println("**************");
        System.out.println("Daire diliminin acisini giriniz :");
        aci = input.nextFloat();
        System.out.println("Acisi " + aci + " olan daire diliminin alani " +
                (pi * Math.pow(yaricap, 2) * aci) / 360);
    }
}
