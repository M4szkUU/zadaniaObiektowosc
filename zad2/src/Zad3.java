class Person{
    String firstName;
    String lastName;
    int age;
    String gender;
    String nationaly;

    public Person(String firstName, String lastName, int age, String gender, String nationaly) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nationaly = nationaly;
    }
    @Override
    public String toString(){
        return "Person [First name: "+firstName+" last name:"+lastName+" Age:"+age+" Gender: "+gender+" Nationality:"+nationaly;
    }
}



public class Zad3 {

    public static void main(String[] args){
        Person person = new Person("Szymon","Brzeski",17,"Man","Poland");
        System.out.println(person);
    }

}
