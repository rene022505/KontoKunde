class Konto {

    Integer ktoNr;
    Double ktoStand;
    String kontoArt = "";
    Kunde zugKunde;

    Konto(Integer pKNummer) {
        this.ktoNr = pKNummer;
    }

    Integer getKtoNr() {
        return ktoNr;
    }

    Kunde getZugKunde() {
        return zugKunde;
    }

    void setZugKunde(Kunde zugKunde) {
        this.zugKunde = zugKunde;
    }

    void einzahlen(Double pBetrag) {
        this.ktoStand += pBetrag;
    }

    void auszahlen(Double pBetrag) {
        this.ktoStand -= pBetrag;
    }

    double kontostandAbfragen() {
        return this.ktoStand;
    }

    String info() {
        String s;

        if(this.ktoNr != null) {
            s = "Kontonummer: " + this.ktoNr + "\n";
        } else {
            s = "Kontonummer: n/a\n";
        }

        if(this.ktoStand != null) {
            s += "Kontostand: " + this.ktoStand + "€\n";
        } else {
            s += "Kontostand: n/a\n";
        }

        if(this.kontoArt != null) {
            s += "Kontoart: " + this.kontoArt + "\n";
        } else {
            s += "Kontoart: n/a\n";
        }

        return s;

    }

}
