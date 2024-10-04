public class student extends Person{
    private String indeks;
    private String klasa;
    public student(){

    }
    public student(String name, Integer age, String indeks, String klasa) {
        super(name, age);
        this.indeks = indeks;
        this.klasa = klasa;
    }
    public student(String indeks, String klasa) {
        this.indeks = indeks;
        this.klasa = klasa;
    }
    public String getIndeks() {
        return indeks;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }
    public void getInfo(){

        System.out.println("imie"+getName()+" wiek:"+getAge()+" indeks:"+indeks+" klasa:"+klasa);
    }
}
