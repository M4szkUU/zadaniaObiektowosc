public class Cat extends IAnimal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return "Miau Miau moje imie " + this.name + " mój kolor to " + this.color;
    }
}