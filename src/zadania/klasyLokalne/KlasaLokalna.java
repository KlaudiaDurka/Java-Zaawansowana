package zadania.klasyLokalne;

public class KlasaLokalna {

    public static void main(String[] args) {

        System.out.println("hello");
        class Name {
            private String firstName;
            private String lastName;

            public Name(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public void printFullName(){
                System.out.println("Nazywasz się " + firstName + " " + lastName);
            }
        }

        Name name = new Name("Paweł", "Kołodziej");
        name.printFullName();
    }

}
