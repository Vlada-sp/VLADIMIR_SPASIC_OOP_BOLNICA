package OOP_HOSPITALSTAFF_WIP;

import java.util.ArrayList;
import java.util.List;

public class Bolnica {

 private   String ime;
    private List<Osoblje> osoblje;
    private List<Pacijent> pacijenti;

    public Bolnica(String ime, List<Osoblje> osoblje, List<Pacijent> pacijenti) {
        this.ime = ime;
        this.osoblje = new ArrayList<>(osoblje);
        this.pacijenti = new ArrayList<>(pacijenti);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Osoblje> getOsoblje() {
        return osoblje;
    }

    public void setOsoblje(List<Osoblje> osoblje) {
        this.osoblje = osoblje;
    }

    public List<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }
}
