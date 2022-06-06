package bazaWiedzy.zadanie2;

public class Student extends Person{

    private String typStudiow;
    private int rokStudiow;
    private float kosztStudiow;

    public Student(String name, String address, String typStudiow, int rokStudiow, float kosztStudiow) {
        super(name, address);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public float getKosztStudiow() {
        return kosztStudiow;
    }

    public void setKosztStudiow(int kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudies='" + typStudiow + '\'' +
                ", yearOfStudy='" + rokStudiow + '\'' +
                ", studiesPrice=" + kosztStudiow +
                '}';
    }

    }
