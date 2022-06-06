package zadania.kolekcje;

import java.util.List;

public class Administrator extends User {

    private List<String> roles;

    public Administrator(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }
}
