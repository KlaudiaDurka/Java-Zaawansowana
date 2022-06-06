package zadania.wzorceStrukturalne;

import java.util.List;

public class Pupil {

    private String firstName;
    private String lastName;
    private String email;
    private List<Integer> grants;
    private Integer age;

    public Pupil(String firstName, String lastName, String email, List<Integer> grants, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.grants = grants;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getGrants() {
        return grants;
    }

    public void setGrants(List<Integer> grants) {
        this.grants = grants;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

