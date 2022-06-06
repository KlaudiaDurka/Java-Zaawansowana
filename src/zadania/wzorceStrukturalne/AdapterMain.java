package zadania.wzorceStrukturalne;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Pupil pupil = new Pupil("Ania", "Nowak", "ania@wp.pl", List.of(), 20);
        students.add(new PupilAdapter(pupil));

    }
}