interface Dzwiek{
        void wydajDzwiek();
}
abstract class Zwierze implements Dzwiek{
    public abstract void  poruszajSie();

}
class Pies extends Zwierze{
    @Override
    public void wydajDzwiek(){
        System.out.println("hau HAu!");
    }

    @Override
    public void poruszajSie(){
        System.out.println("Pies biega");
    }
}

class Kot extends Zwierze{
    @Override
    public void wydajDzwiek(){
        System.out.println("Miau Miau!");
    }

    @Override
    public void poruszajSie(){
        System.out.println("Kot Chodzi");
    }
}


public class zad1 {
    public static void main( String[] args){
        Zwierze pies = new Pies();
        pies.wydajDzwiek();
        pies.poruszajSie();
        Zwierze kot = new Kot();
        kot.wydajDzwiek();
        kot.poruszajSie();
    }
}
