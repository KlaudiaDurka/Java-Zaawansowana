package zadania.adnotacja;

public class AdnotacjeMain {

    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik();
        pracownik.wykonaj();

        Student student = new Student();
        student.setKierunek("Informatyka");
        student.setWydzial("Informatka");
        student.setNumerIndeksu("103");

        System.out.println(student);
    }
}
