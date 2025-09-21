package OOP_HOSPITALSTAFF_WIP;

import java.util.Objects;

public class Osoba implements Cloneable{
    private     String ime;
    private String prezime;
    private int godine;


    public Osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        if (ime == null){
            this.ime = "";
        }
        this.prezime = prezime;
        if (prezime== null){
            this.prezime = "";
        }
        this.godine = godine;
        if (this.godine<0){
            this.godine = 0;
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    @Override
    public String toString() {
        return "{"+ ime +"} { "+ prezime + "} [{ "+ godine +" }]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return godine == osoba.godine && Objects.equals(ime, osoba.ime) && Objects.equals(prezime, osoba.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, godine);
    }

    public Osoba clone() throws CloneNotSupportedException {
        return (Osoba) super.clone();
    }
}
//1.2 [1] Napisati konstruktor koji prima ime, prezime i godine i postavlja
//vrednosti odgovaraju´cih atributa na odgovaraju´ce prosledjene vrednosti.
//Ukoliko se prosledi null za neku od niski, postaviti odgovaraju´ci atribut
//na praznu nisku (¨¨), a ukoliko se prosledi negativan broj, postaviti
//godine na 0.
//1.3 [1] Enkapsulirati sve podatke i kreirati podrazumevane getter-e i
//setter-e za svako polje.
//1.4 [1] Nadjaˇcati String toString() metodu tako da vra´ca nisku oblika:
//1 "{ime} { prezime } [{ godine }]"
//1.5 [1] Nadjaˇcati metode int hashCode() i boolean equals(Object o).
//Dve osobe su iste ako i samo ako imaju isto ime, prezime i broj godina.
//1.6 [1] Implementirati metodu public Osoba clone() throws
//CloneNotSupportedException tako da kreira i vra´ca duboku kopiju
//sebe.