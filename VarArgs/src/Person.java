public class Person {
        String firstname,lastname,email,adress;

        public Person(String firstname, String lastname, String email, String adress) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.adress = adress;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }
        @Override
        public String toString(){
            return "Hi my name  is "+firstname +" "+lastname+", my email is "+email+" and i live in "+adress+".";
        }
}
