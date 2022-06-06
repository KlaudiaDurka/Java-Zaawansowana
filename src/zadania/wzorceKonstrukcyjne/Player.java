package zadania.wzorceKonstrukcyjne;

public abstract class Player {

    private Integer experience;

    public Integer getExperience() {

        return experience;
    }

    public void setExperience(Integer experience) {

        this.experience = experience;
    }

    public abstract Game play();
}
