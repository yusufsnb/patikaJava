import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ay, gun;

        System.out.println("Dogdugunuz gun : ");
        gun = sc.nextInt();

        System.out.println("Dogdugunuz ay : ");
        ay = sc.nextInt();

        if(ay == 3)
        {
            if(gun >= 21)
                System.out.println("Koc Burcu");
            else
                System.out.println("Balik Burcu");
        }
        else if (ay==4){
            if(gun >= 21)
                System.out.println("Boga Burcu");
            else
                System.out.println("Koc Burcu");
        }
        else if (ay==5){
            if(gun >= 22)
                System.out.println("Ikizler Burcu");
            else
                System.out.println("Boga Burcu");
        }
        else if (ay==6){
            if(gun >= 23)
                System.out.println("Yengec Burcu");
            else
                System.out.println("Ikizler Burcu");
        }
        else if (ay==7){
            if(gun >= 23)
                System.out.println("Aslan Burcu");
            else
                System.out.println("Yengec Burcu");
        }
        else if (ay==8){
            if(gun >= 23)
                System.out.println("Basak Burcu");
            else
                System.out.println("Aslan Burcu");
        }
        else if (ay==9){
            if(gun >= 23)
                System.out.println("Terazi Burcu");
            else
                System.out.println("Basak Burcu");
        }
        else if (ay==10){
            if(gun >= 23)
                System.out.println("Akrep Burcu");
            else
                System.out.println("Terazi Burcu");
        }
        else if (ay==11){
            if(gun >= 22)
                System.out.println("Yay Burcu");
            else
                System.out.println("Akrep Burcu");
        }
        else if (ay==12){
            if(gun >= 22)
                System.out.println("Oglak Burcu");
            else
                System.out.println("Yay Burcu");
        }
        else if (ay==1){
            if(gun >= 22)
                System.out.println("Kova Burcu");
            else
                System.out.println("Oglak Burcu");
        }
        else if (ay==2){
            if(gun >= 20)
                System.out.println("Balik Burcu");
            else
                System.out.println("Kova Burcu");
        }

    }
}
