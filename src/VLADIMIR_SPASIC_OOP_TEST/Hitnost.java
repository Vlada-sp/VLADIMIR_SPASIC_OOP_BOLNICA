package VLADIMIR_SPASIC_OOP_TEST;

public enum Hitnost {

    ZELENO,
 ZUTO,
CRVENO;

private Hitnost hitnost;

    void povecajHitnost(){
        switch (hitnost){
            case ZELENO:
                hitnost = Hitnost.ZUTO;
                break;
            case ZUTO, CRVENO:
                hitnost = Hitnost.CRVENO;
                break;
        }
    }


    void smanjiHitnost(){
        switch (hitnost){
            case CRVENO:
                hitnost = Hitnost.ZUTO;
                break;
            case ZUTO:
                hitnost = Hitnost.ZELENO;
                break;
            case ZELENO:
                break;
        }
    }

}


//2. [4] Napisati enumerisani tip Hitnost koja predstavlja hitnost obradjivanja
//nekog pacijenta. Hitnost je predstavljeno bojama zeleno, ˇzuto i crveno koje
//oznaˇcavaju najmanju, srednju i najve´cu hitnost tim redom.
//2.1 [1] Konstante ovog enumerisanog tipa su:
//• ZELENO
//• ZUTO
//• CRVENO
//2.2 [1] Polja ove klase su:
//• Hitnost hitnost;
//Postaviti vidljivost ovog polja na private i ne kreirati getter i ne
//kreirati setter za ovo polje.
//2

//2.3 Kreirati metode za objekte ove klase:
//• [1] void povecajHitnost() - koja pove´cava hitnost na narednu,
//paziti na to da se ne moˇze i´ci na ve´cu hitnost od crvene.
//• [1] void smanjiHitnost() - koja smanjuje hitnost na prethodnu,
//paziti na to da se ne moˇze ici na manju hitnost od zelene.