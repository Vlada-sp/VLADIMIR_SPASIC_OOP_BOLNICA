package OOP_HOSPITALSTAFF_WIP;

import java.util.Objects;

public abstract class Osoblje extends Osoba implements Zaposljiv, Cloneable {
private Pozicija pozicija;

    public Osoblje(String ime, String prezime, int godine, Pozicija pozicija) {
        super(ime, prezime, godine);
        this.pozicija = pozicija;
    }

    public Osoblje(Osoba o, Pozicija pozicija) {
        super(o.getIme(),o.getPrezime(),o.getGodine());
        this.pozicija = pozicija;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    public void setPozicija(Pozicija pozicija) {
        this.pozicija = pozicija;
    }

    @Override
    public String toString() {
         return "{"+ super.getIme() + "} { " + super.getPrezime() + " } [{" + super.getGodine() + "}] ({ " + this.pozicija + "})";

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Osoblje osoblje = (Osoblje) o;
        return pozicija == osoblje.pozicija && Objects.equals(super.getIme(), osoblje.getIme()) && Objects.equals(super.getPrezime(), osoblje.getPrezime()) &&
                Objects.equals(super.getGodine(), osoblje.getGodine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pozicija);
    }

    public Pacijent clone () throws CloneNotSupportedException {
        return (Pacijent) super.clone();
    }
}


//6. [6] Napisati apstraktnu klasu Osoblje koja proˇsiruje klasu Osoba i
//implementira interfejs Zaposljiv i predstavlja osoblje bolnice.
//6.1 [1] Svako osoblje kao atribute ima:
//• Pozicija pozicija;
//6.2 [1] Kreirati dva konstruktora:
//• Jedan konstruktor koji prima ime, prezime, godine i poziciju i
//postavlja odgovaraju´ca polja na odgovaraju´ce prosledjene vrednosti.

//• Jedan konstruktor koji prima Osobu o i poziciju i postavlja
//odogvaraju´ca polja na odgovaraju´ce prosledjene vrednosti.

//6.3 [1] Enkapsulirati sve podatke i kreirati podrazumevane getter-e i
//setter-e za svako polje.
//6.4 [1] Nadjaˇcati String toString() metodu tako da vra´ca nisku oblika:
//1 "{ime} { prezime } [{ godine }] ({ pozicija })"
//6.5 [1] Nadjaˇcati metode int hashCode() i boolean equals(Object o).
//Dve instance osoblja su iste ako i samo ako imaju isto ime, prezime,
//broj godina i istu poziciju.
//6.6 [1] Nadjaˇcati metodu public Osoblje clone() throws
//CloneNotSupportedException tako da kreira i vra´ca duboku kopiju
//sebe.