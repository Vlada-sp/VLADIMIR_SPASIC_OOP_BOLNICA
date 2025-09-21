package OOP_HOSPITALSTAFF_WIP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Doktor extends Osoblje implements Zaposljiv {
   private RadnoMesto radnoMesto;
    private List<Pacijent> pacijenti;
    private List<MedicinskaSestra> medicinskeSestre;

    public Doktor(String ime, String prezime, int godine, Pozicija pozicija, RadnoMesto radnoMesto, List<Pacijent> pacijenti, List<MedicinskaSestra> medicinskeSestre) throws CloneNotSupportedException {
        super(ime, prezime, godine, pozicija);
        this.radnoMesto = radnoMesto;
        this.pacijenti = new ArrayList<>();
        for (Pacijent p : pacijenti) {
            this.pacijenti.add((Pacijent) p.clone());
        }
        this.medicinskeSestre = new ArrayList<>(medicinskeSestre);
    }

    public Doktor(Osoba o, Pozicija pozicija, RadnoMesto radnoMesto, List<Pacijent> pacijenti, List<MedicinskaSestra> medicinskeSestre) throws CloneNotSupportedException {
        super(o, pozicija);
        this.radnoMesto = radnoMesto;
        this.pacijenti = new ArrayList<>();
        for (Pacijent p : pacijenti) {
            this.pacijenti.add((Pacijent) p.clone());
        }
        this.medicinskeSestre = medicinskeSestre;
    }

    public RadnoMesto getRadnoMesto() {
        return radnoMesto;
    }

    public void setRadnoMesto(RadnoMesto radnoMesto) {
        this.radnoMesto = radnoMesto;
    }

    public List<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public List<MedicinskaSestra> getMedicinskeSestre() {
        return medicinskeSestre;
    }

    public void setMedicinskeSestre(List<MedicinskaSestra> medicinskeSestre) {
        this.medicinskeSestre = medicinskeSestre;
    }

    @Override
    public void obradiPacijenta(Pacijent p) {
 if (getRadnoMesto().equals(RadnoMesto.OPSTA_MEDICINA)){
     if (p.isObradjen()){
         System.out.println("Pacijent je vec obradjen");
     }
     else System.out.println(p + "Obradjen");
     p.setObradjen(true);
 }
        if (getRadnoMesto().equals(RadnoMesto.HIRURGIJA)){
            if (p.isObradjen()){
                System.out.println("Pacijent je vec Operisan");
            }
            else System.out.println(p + "Operisan");
            p.setObradjen(true);
        }}

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{" + super.getIme() + "} { " + super.getPrezime() + " } [{" + super.getGodine() + radnoMesto);
        for (MedicinskaSestra se :medicinskeSestre){
            s.append(se.toString());}
         for (Pacijent p : pacijenti) {
             s.append(p.toString());

        }

        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doktor doktor = (Doktor) o;
        return radnoMesto == doktor.radnoMesto && Objects.equals(pacijenti, doktor.pacijenti) && Objects.equals(medicinskeSestre, doktor.medicinskeSestre); // istim redom hmm
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radnoMesto, pacijenti, medicinskeSestre);
    }

    List<Pacijent> ListaHitnosti = new ArrayList<>();
    void obradiSvePacijente(){


        for (Pacijent p : pacijenti){
            if (p.getHitnost() == Hitnost.CRVENO){
                ListaHitnosti.add(p);
            }
        }
        for (Pacijent p : pacijenti){
            if (p.getHitnost() == Hitnost.ZUTO){
                ListaHitnosti.add(p);
            }
        }
        for (Pacijent p : pacijenti){
            if (p.getHitnost() == Hitnost.ZELENO){
                ListaHitnosti.add(p);
            }
        }
        System.out.println("List je obradjena po hitnosti" + ListaHitnosti.toString());
    }


}
