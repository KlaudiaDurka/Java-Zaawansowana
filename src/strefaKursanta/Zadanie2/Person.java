package strefaKursanta.Zadanie2;

public class Person {

    public static void main(String[] args) {
        Person student = new Student("Math", 2, 3500);
        Person staff = new Staff("Manager", 5200);

        System.out.println(student);
        System.out.println(staff);
    }


    protected String name, address;

    public Person(){

    }

    public Person(String name, String address){

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
        return String.format("%s->%s", name, address);
    }
}
