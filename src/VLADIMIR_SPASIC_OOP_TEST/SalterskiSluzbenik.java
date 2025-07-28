package VLADIMIR_SPASIC_OOP_TEST;

import java.util.ArrayList;
import java.util.List;

public class SalterskiSluzbenik extends  Osoblje implements Zaposljiv {

   private List<Pacijent> pacijenti;

    public SalterskiSluzbenik(String ime, String prezime, int godine, Pozicija pozicija, List<Pacijent> pacijenti) throws CloneNotSupportedException {
        super(ime, prezime, godine, pozicija);
        this.pacijenti = new ArrayList<>();
        for (Pacijent p: pacijenti){
            this.pacijenti.add((Pacijent) p.clone());
        }
    }

    public SalterskiSluzbenik(Osoba o, Pozicija pozicija, List<Pacijent> pacijenti) throws CloneNotSupportedException {
        super(o, pozicija);
        this.pacijenti = new ArrayList<>();
        for (Pacijent p : pacijenti) {
            this.pacijenti.add((Pacijent) p.clone());
        }
    }

    public List<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }

    @Override
    public void obradiPacijenta(Pacijent p) {
        char PrviChar = p.getDijagnoza().charAt(0);
        if (p.isObradjen()){
            System.out.println("Pacijent je vec obradjen");
        }
        else
        if (PrviChar == 'x' ){
            p.getHitnost().povecajHitnost();

        }
    }

    void povecajHitnost(Pacijent p){
        p.getHitnost().povecajHitnost();

    }

    void smanjiHitnost(Pacijent p){
        p.getHitnost().smanjiHitnost();
    }
    Pacijent najhitnijiPacijent(){
        
        if (pacijenti.isEmpty()){
            return null;
        }
        Pacijent najhitniji = null;
        for (Pacijent p : pacijenti){
            if (p.getHitnost()== Hitnost.CRVENO){
                najhitniji = p;
                pacijenti.remove(p);
                
                break;
            }
        }
        return najhitniji;
    }

    @Override
    public String toString() {

        String s = "{"+ super.getIme() + "} { " + super.getPrezime() + " } [{" + super.getGodine() + "SALTERSKI_SLUZBENIK";
        s+=  pacijenti.get(0).toString() ;
        s+= pacijenti.get(1).toString() ;

        return s;

    }
}


//koja vra´ca najhitnijeg
//pacijenta iz liste pacijenata i izbacuje ga iz liste. Najhitniji pacijent
//je onaj pacijent sa najve´com hitnoˇs´cu. Ukoliko ima viˇse takvih,
//vratiti prvog takvog u listi pacijenata. Ukoliko nema pacijenata u
//listi pacijenata vratiti null.

