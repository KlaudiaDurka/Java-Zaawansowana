package strefaKursanta.Zadanie2;

public class Staff extends Person{

    private String specialization;
    private float salary;

    public Staff(String specialization, float salary){

        super();
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialisation) {
        this.specialization = specialisation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
