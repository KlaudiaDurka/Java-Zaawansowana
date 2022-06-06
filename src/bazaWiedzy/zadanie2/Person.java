package bazaWiedzy.zadanie2;

public class Person {
    public static void main(String[] args) {

        Student student = new Student("Andrzej",
                "Sosnowiec",
                "Stacjonarne",
                3,
                5000);

        Staff staff = new Staff("Iza",
                "Ciechocinek",
                "Finanse",
                45000);

        Person person = new Person("ALeksander", "Spała");

        System.out.println(student);
        System.out.println(staff);
        System.out.println(person);
        }

    String name;
    String address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", name, address);
    }
}
