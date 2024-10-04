public class Dog extends IAnimal{

    public Dog(String name, String color) {
        super (name,color);
    }

    @Override
    public String makeSound() {
        return "Hau hau moje imie "+name+" mój kolor to "+color;
    }

}
