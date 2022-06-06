package zadania.enumy;

public class Ubezpieczenie {

    private Integer id;
    private String nazwa;
    private TypUbezpieczenia typ;
    private StatusUbezpieczenia status;

    public Ubezpieczenie(Integer id, String nazwa, TypUbezpieczenia typ, StatusUbezpieczenia status) {
        this.id = id;
        this.nazwa = nazwa;
        this.typ = typ;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public TypUbezpieczenia getTyp() {
        return typ;
    }

    public void setTyp(TypUbezpieczenia typ) {
        this.typ = typ;
    }

    public StatusUbezpieczenia getStatus() {
        return status;
    }

    public void setStatus(StatusUbezpieczenia status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ubezpieczenie{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", typ=" + typ +
                ", status=" + status +
                '}';
    }
}
