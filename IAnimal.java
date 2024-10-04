public class IAnimal {
    String name;
    String color;

    public IAnimal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String makeSound(){
        return "brak";
    }
}
