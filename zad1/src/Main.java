import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);
        /*
        //zad1
        System.out.println("hello world!");
         */
        /*
        //zad2
        System.out.println("Podaj rok urodzenia:");
        int rok= podaj.nextInt();
        rok=2024-rok;
        System.out.println("Twoj wiek wynosi: " + rok);
        */
        //zad3
        int wynik=0;
        System.out.println("Podaj liczbe a:");
        int a = podaj.nextInt();
        System.out.println("Podaj liczbe b:");
        int b = podaj.nextInt();
        System.out.println("Wybierz: 1.dodawnie,2.odejmowanie,3.mnozene,4.dzielenie");
        wynik = podaj.nextInt();
        if(wynik==1){
            int dodawanie=a+b;
            System.out.println("dodawanie:"+ dodawanie);
        } else if (wynik==2) {
            int odejmowanie=a-b;
            System.out.println("odejmowanie:"+ odejmowanie);
        } else if (wynik==3) {
            int mnozenie=a*b;
            System.out.println("mnozenie:"+ mnozenie);
        } else if (wynik==4) {
            int dzielenie=a/b;
            System.out.println("dzielenie:"+ dzielenie);
        }
        /*
        //zad4
        double cel=0;
        double far=0;
        int wynik=0;

        System.out.println("jesli chcesz c na f to wybierz 1 na odrwrot 2:");
        wynik = podaj.nextInt();
        if(wynik==1) {
            System.out.println("Podaj temperature:");
            cel = podaj.nextDouble();
            far = cel*1.8+32;
            System.out.println("temperatura w F wynosi:" + far);
        } else if (wynik==2) {
            System.out.println("Podaj temperature:");
            far = podaj.nextDouble();
            cel = (far-32)*1.8;
            System.out.println("temperatura w C wynosi:" + cel);
        }

         */
    }
}
