
public class Zad1 {
    public static void main(String[] args) {
        Person person1 = new Person("Alan", "Maszk", "maszk4@gmil.com", "Kamela ul.Przzywidzka44");
        Person person2 = new Person("Szymon","Brzeski","szymonek@gmail.com","Gdansk ul.Warnenska44");
        Person person3 = new Person("Kacper","Brzeski","szymonek@gmail.com","Gdansk ul.Warnenska44");
        Person person4 = new Person("Tymon","Brzeski","szymonek@gmail.com","Gdansk ul.Warnenska44");
        PersonDetails(person1);
        PersonDetails(person2,person3,person4);
    }
    public static void PersonDetails(Person person){
        System.out.println(person.toString());
    }
    public static void PersonDetails(Person... persons){
        for(Person person : persons) {
            System.out.println(person.toString());
        }
    }
}