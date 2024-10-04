public class Main {
    public static void main(String[] args) {
        Dog kulka = new Dog("Kula", "biały");
        Cat kot = new Cat("Ptyś","czarny");
        System.out.println(kulka.makeSound());
        System.out.println(kot.makeSound());
    }
}
