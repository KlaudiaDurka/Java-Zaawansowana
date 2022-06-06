package strefaKursanta.Zadanie2;

public class Student extends Person{

    private String fieldOfStudies;
    private int yearOfStudies;
    private float costOfStudies;

    public Student(String fieldOfStudies, int yearOfStudies, float costOfStudies){

        super();
        this.fieldOfStudies = fieldOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.costOfStudies = costOfStudies;
    }

    public String getFieldOfStudies() {
        return fieldOfStudies;
    }

    public void setFieldOfStudies(String fieldOfStudies) {
        this.fieldOfStudies = fieldOfStudies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public float getCostOfStudies() {
        return costOfStudies;
    }

    public void setCostOfStudies(float costOfStudies) {
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", typeOfStudies='" +
                fieldOfStudies + '\'' + ", yearOfStudy='" + yearOfStudies + '\'' +
                ", studiesPrice=" + costOfStudies + '}';

    }
}
