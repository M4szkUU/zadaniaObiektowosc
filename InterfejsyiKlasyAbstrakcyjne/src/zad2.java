interface  Platnosc{
    void wykonajPlatnosc(double kwota);
}
abstract class KartaPlatnicza implements Platnosc{
    double saldo;

    public KartaPlatnicza (double saldo){
        this.saldo=saldo;
    }
    public void doladuj(double kwota){
        saldo +=kwota;
        System.out.println("Doładiwanie: "+ kwota+" PLN, Nowe saldo: "+saldo+" PLN");
    }
}
class  KartaDebetowa extends KartaPlatnicza{
    public KartaDebetowa(double saldo){
        super(saldo);
    }
    @Override
    public void wykonajPlatnosc(double kwota){
        if (saldo >= kwota) {
            saldo -= kwota;
            System.out.println("Płatność "+kwota+" PLN zaakceptowana");
        }else {
            System.out.println("Za mało srodkow na koncie");
        }
    }
    @Override
    public void doladuj(double kwota){
        saldo += kwota;
        System.out.println("Doladowanie: "+kwota+"PLN. nowe saldo: "+saldo+" PLN");
    }
}
class  KartaKredytowa extends KartaPlatnicza{
    double limitKredytowy;

    public KartaKredytowa(double saldo, double limitKredytowy){
        super(saldo);
        this.limitKredytowy=limitKredytowy;
    }
    @Override
    public void wykonajPlatnosc(double kwota){
        if(saldo + limitKredytowy >=kwota){
            saldo -=kwota;
            System.out.println("Platnosc "+kwota+" PLN zaakceptowana");
        }else {
            System.out.println("Przekroczono limit kredytow");
        }
    }
    @Override
    public void doladuj(double kwota){
        saldo =+kwota;
        System.out.println("Doladowano: "+kwota+" PLN. Nowe saldo: "+saldo);
    }
}

public class zad2 {
    public static void main(String[] args){
        KartaPlatnicza kartaDebetowa = new KartaDebetowa(500);
        kartaDebetowa.wykonajPlatnosc(100);
        kartaDebetowa.doladuj(50);

        KartaPlatnicza kartaKredytowa = new KartaKredytowa(1000, 2000);
        kartaKredytowa.wykonajPlatnosc(1200);
        kartaKredytowa.doladuj(500);
    }
}
