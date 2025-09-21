package OOP_HOSPITALSTAFF_WIP;

import java.util.Objects;

public class Pacijent extends Osoba {
 private String dijagnoza;
    private Hitnost hitnost;
    private boolean obradjen;

    public Pacijent(String ime, String prezime, int godine, String dijagnoza, Hitnost hitnost) {
        super(ime, prezime, godine);
        this.dijagnoza = dijagnoza;
        this.hitnost = hitnost;
    }

    public Pacijent(Osoba o, String dijagnoza, boolean obradjen) {
        super(o.getIme(),o.getPrezime(),o.getGodine());
        this.dijagnoza = dijagnoza;
        this.obradjen = false;
    }


    public String getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    public Hitnost getHitnost() {
        return hitnost;
    }

    public void setHitnost(Hitnost hitnost) {
        this.hitnost = hitnost;
    }

    public boolean isObradjen() {
        return obradjen;
    }

    public void setObradjen(boolean obradjen) {
        this.obradjen = obradjen;
    }

    @Override
    public String toString() {
        return "{"+ super.getIme() + "} { " + super.getPrezime() + " } [{" + super.getGodine()  + " }] Dijagnoza : { " + dijagnoza + " } Hitnost : {"+  hitnost +" }";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pacijent pacijent = (Pacijent) o;
        return Objects.equals(super.getIme(), pacijent.getIme()) && Objects.equals(super.getPrezime(), pacijent.getPrezime()) &&
                Objects.equals(super.getGodine(), pacijent.getGodine()) && Objects.equals(dijagnoza, pacijent.dijagnoza) && hitnost == pacijent.hitnost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dijagnoza, hitnost, obradjen);
    }
}


//[6] Napisati klasu VLADIMIR_SPASIC_OOP_TEST.Pacijent koja proˇsiruje klasu Osoba i predstavlja
//pacijenta bolnice.
//3.1 [1] Svaki pacijent kao atribute ima:
//• String dijagnoza;
//• Hitnost hitnost;
//• boolean obradjen;
//Svaka dijagnoza poˇcinje sa malim slovom ’x’ ili sa malim slovom ’y’ ˇsto
//oznaˇcava da se dijagnoza tiˇce hirurgije za ’x’ i opˇste medicine za ’y’.
//3.2 [1] Kreirati dva konstruktora:
//• Jedan konstruktor koji prima ime, prezime, godine, dijagnozu i
//hitnost i postavlja odgovaraju´ca polja na odgovaraju´ce prosledjene
//vrednosti.
//• Jedan konstruktor koji prima Osobu o, dijagnozu i hitnost i
//postavlja odgovaraju´ca polja na odgovaraju´ce prosledjene vrednosti.
//Prilikom kreacije pacijenta uvek postaviti obradjen na false.
//3.3 [1] Enkapsulirati sve podatke i kreirati podrazumevane getter-e i
//setter-e za svako polje.
//3.4 [1] Nadjaˇcati String toString() metodu tako da vra´ca nisku oblika:
//1 "{ime} { prezime } [{ godine }]
//2 Dijagnoza : { dijagnoza }
//3 Hitnost : { hitnost }"
//3.5 [1] Nadjaˇcati metode int hashCode() i boolean equals(Object o).
//Dva pacijenta su ista ako i samo ako imaju isto ime, prezime, broj
//godina, istu dijagnozu i istu hitnost.
//3.6 [1] Nadjaˇcati metodu public VLADIMIR_SPASIC_OOP_TEST.Pacijent clone() throws
//CloneNotSupportedException tako da kreira i vra´ca duboku kopiju
//sebe.