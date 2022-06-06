package zadania.wzorceKonstrukcyjne;

import java.util.ArrayList;
import java.util.List;

public class Dom extends Nieruchomosc implements Cloneable {

    private Integer liczbaPieter;
    private List<Pomieszczenie> pomieszczenia;

    public Dom(String lokalizacja, Integer liczbaPieter, List<Pomieszczenie> pomieszczenia) {
        setLokalizacja(lokalizacja);
        this.liczbaPieter = liczbaPieter;
        this.pomieszczenia = pomieszczenia;
    }

    public Integer getLiczbaPieter() {
        return liczbaPieter;
    }

    public void setLiczbaPieter(Integer liczbaPieter) {
        this.liczbaPieter = liczbaPieter;
    }

    public List<Pomieszczenie> getPomieszczenia() {
        return pomieszczenia;
    }

    public void setPomieszczenia(List<Pomieszczenie> pomieszczenia) {
        this.pomieszczenia = pomieszczenia;
    }

    public void setLokalizacja(){
        System.out.println("wfefwef");
    }

    @Override
    public String toString() {
        return "Dom{" +
                "liczbaPieter=" + liczbaPieter +
                ", pomieszczenia=" + pomieszczenia +
                '}';
    }

    @Override
    public Dom clone() throws CloneNotSupportedException {
        Dom dom = (Dom) super.clone();
        List<Pomieszczenie> pomieszczenia = new ArrayList<>();
        for(Pomieszczenie pomieszczenie : dom.getPomieszczenia()){
            pomieszczenia.add(new Pomieszczenie(pomieszczenie.getTyp()));
        }

        dom.setPomieszczenia(pomieszczenia);
        return dom;
    }
}
