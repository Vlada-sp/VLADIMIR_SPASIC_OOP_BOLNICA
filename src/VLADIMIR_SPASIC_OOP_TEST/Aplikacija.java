package VLADIMIR_SPASIC_OOP_TEST;

public class Aplikacija {
    private Bolnica bolnica;

    public Aplikacija(Bolnica bolnica) {
        this.bolnica = bolnica;
    }

    public Bolnica getBolnica() {
        return bolnica;
    }

    public void setBolnica(Bolnica bolnica) {
        this.bolnica = bolnica;
    }


    Doktor doktorSaNajvisePacijenata(){
      Doktor saNajvise = null;
      String ime;

      int najduze = -1;

        for (Osoblje o: bolnica.getOsoblje()){
            if (o instanceof Doktor){
                Doktor d = (Doktor) o;
                int brojPacijenata =d.getPacijenti().size();
                 if (brojPacijenata>najduze){
                     najduze = brojPacijenata;
                     saNajvise = d;
                 }
            }
        }
        return  saNajvise;
    }
    Doktor doktorSaNajviseMedicinskihSestara(){
        Doktor saNajvise = null;


        int najduze = -1;

        for (Osoblje o: bolnica.getOsoblje()){
            if (o instanceof Doktor){
                Doktor d = (Doktor) o;
                int brojSestara =d.getMedicinskeSestre().size();
                if (brojSestara>najduze){
                    najduze = brojSestara;
                    saNajvise = d;
                }
            }
        }
        return  saNajvise;

    }
    int brojPacijenataZaHirurgiju(){

        int broj =0;
        for (Pacijent p : bolnica.getPacijenti()){
            if (p.getDijagnoza().charAt(0)=='x'){
                broj++;
            }
        }
        return broj;
    }
    int brojPacijenataZaOpstuMedicinu(){

        int broj =0;
        for (Pacijent p : bolnica.getPacijenti()){
            if (p.getDijagnoza().charAt(0)=='y'){
                broj++;
            }
        }
        return broj;
    }
    Pacijent najhitnijiPacijent() {


        for (Pacijent p : bolnica.getPacijenti()) {
            if (p.getDijagnoza().charAt(0) == 'x' && p.getHitnost() == Hitnost.CRVENO) {
                return p;
            }}
            for (Pacijent p : bolnica.getPacijenti()) {
                if (p.getDijagnoza().charAt(0) == 'x' && p.getHitnost() == Hitnost.ZUTO) {
                    return p;
                }
            }
        for (Pacijent p : bolnica.getPacijenti()) {
            if (p.getDijagnoza().charAt(0) == 'x' && p.getHitnost() == Hitnost.ZELENO) {
                return p;
            }
        }

        for (Pacijent p : bolnica.getPacijenti()) {
            if (p.getHitnost() == Hitnost.CRVENO) {
                return p;
            }}
        for (Pacijent p : bolnica.getPacijenti()) {
            if (p.getHitnost() == Hitnost.ZUTO) {
                return p;
            }
        }
        for (Pacijent p : bolnica.getPacijenti()) {
            if (p.getHitnost() == Hitnost.ZELENO) {
                return p;
            }
        }

        return null;
    }
    void proslediSeledecegPacijenta() throws CloneNotSupportedException {


        if (bolnica.getPacijenti()!=null){
    Pacijent p =  bolnica.getPacijenti().getFirst();

     for (Osoblje o: bolnica.getOsoblje()){
         if (o instanceof SalterskiSluzbenik){
             SalterskiSluzbenik d = (SalterskiSluzbenik) o;
             d.getPacijenti().add(p);
             break;
         }}
     bolnica.getPacijenti().removeFirst();
    }
        for (Osoblje o: bolnica.getOsoblje()){
            if (o instanceof MedicinskaSestra) {
                MedicinskaSestra m = (MedicinskaSestra) o;


    }}


// potrosio sam sve mentalne resurse  -> "OutOfMemoryError" izgleda da ce pacijenti ostati večno u čekaonici
}}


