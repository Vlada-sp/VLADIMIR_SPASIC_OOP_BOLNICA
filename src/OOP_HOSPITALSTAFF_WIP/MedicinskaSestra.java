package OOP_HOSPITALSTAFF_WIP;

import java.util.Objects;

public class MedicinskaSestra extends Osoblje implements Zaposljiv {
  private   Doktor hirurg;
    private Doktor doktorOpsteMedicine;


    public MedicinskaSestra(String ime, String prezime, int godine, Pozicija pozicija, Doktor hirurg, Doktor doktorOpsteMedicine) {
        super(ime, prezime, godine, pozicija);
        this.hirurg = hirurg;
        this.doktorOpsteMedicine = doktorOpsteMedicine;
    }

    public MedicinskaSestra(Osoba o, Pozicija pozicija, Doktor hirurg, Doktor doktorOpsteMedicine) {
        super(o, pozicija);
        this.hirurg = hirurg;
        this.doktorOpsteMedicine = doktorOpsteMedicine;
    }

    public Doktor getHirurg() {
        return hirurg;
    }

    public void setHirurg(Doktor hirurg) {
        this.hirurg = hirurg;
    }

    public Doktor getDoktorOpsteMedicine() {
        return doktorOpsteMedicine;
    }

    public void setDoktorOpsteMedicine(Doktor doktorOpsteMedicine) {
        this.doktorOpsteMedicine = doktorOpsteMedicine;
    }

    @Override
    public String toString() {
        String s=  "{"+ super.getIme() + "} { " + super.getPrezime() + " } [{" + super.getGodine() + "MEDICINSKA_SESTRA";
              s+=  "hirurg=" + hirurg.getIme() + hirurg.getPrezime();
              s+=   ", doktorOpsteMedicine=" + doktorOpsteMedicine.getIme() + doktorOpsteMedicine.getPrezime();


                return s;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MedicinskaSestra that = (MedicinskaSestra) o;
        return Objects.equals(super.getIme(),that.getIme()) && Objects.equals(super.getPrezime(),that.getPrezime())&&Objects.equals(super.getGodine(),that.getGodine())   &&Objects.equals(doktorOpsteMedicine, that.doktorOpsteMedicine)&& Objects.equals(hirurg, that.hirurg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hirurg, doktorOpsteMedicine);
    }

    @Override
    public void obradiPacijenta(Pacijent p) {
        char PrviChar = p.getDijagnoza().charAt(0);
       if (PrviChar == 'x' ){
           hirurg.getPacijenti().add(p);
       } else if (PrviChar == 'y') {
           doktorOpsteMedicine.getPacijenti().add(p);

       }
       else System.out.println("los unos");


        //[7] void obradiPacijenta(Pacijent p) - tako ˇsto medicinska
        //sestra ˇsalje pacijenta p svome doktoru ˇsto se manifestuje
        //dodavanjem pacijenta p na kraj doktorove liste pacijenata.
        //HINT: Treba ´ce vam String-ovna funkcija .charAt()

            //Svaka dijagnoza poˇcinje sa malim slovom ’x’ ili sa malim slovom ’y’ ˇsto
        //oznaˇcava da se dijagnoza tiˇce hirurgije za ’x’ i opˇste medicine za ’y’.
    }
}
