public class teacher extends Person{
    private String subject;
    private Integer wage;
    public teacher(){

    }
    public teacher(String name, Integer age,String subject, Integer wage) {
        super(name, age);
        this.subject = subject;
        this.wage = wage;

    }
    public teacher(String subject, Integer wage) {
        this.subject = subject;
        this.wage = wage;

    }

    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Integer getWage() {
        return wage;
    }
    public void setWage(Integer wage) {
        this.wage = wage;
    }
    public void getInfo(){

        System.out.println("imie"+getName()+" wiek:"+getAge()+" lekcja:"+subject+" wypłata:"+wage);
    }
}
