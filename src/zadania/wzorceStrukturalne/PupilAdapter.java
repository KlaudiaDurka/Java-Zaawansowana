package zadania.wzorceStrukturalne;

import java.util.List;

public class PupilAdapter implements Student {


    private final Pupil pupil;


    public PupilAdapter(Pupil pupil) {
        this.pupil = pupil;
    }

    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetails() {
        return pupil.getEmail();
    }

    @Override
    public List<Integer> getResults() {
        return pupil.getGrants();
    }
}
