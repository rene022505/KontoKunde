
import java.util.Arrays;


class Kunde {

    String name, adresse;
    Integer geburtsjahr;
    Konto[] zugKonto = new Konto[1];
    int index = 0;

    Kunde(String pName) {
        this.name = pName;
    }

    Konto getZugKonto(int i) {
        for(Konto k : zugKonto) {
            if(k.ktoNr == i) {
                return k;
            }
        }
        System.out.println("Konto nicht gefunden!");
        return null;
    }

    void setAdresse(String pAdresse) {
        this.adresse = pAdresse;
    }

    void setGeburtsjahr(int pJahr) {
        this.geburtsjahr = pJahr;
    }

    String info() {
        StringBuilder s;
        s = new StringBuilder("Name: " + this.name + "\n");

        if (this.adresse != null) {
            s.append("Adresse: ").append(this.adresse).append("\n");
        } else {
            s.append("Adresse: n/a\n");
        }

        if (this.geburtsjahr != null) {
            s.append("Geburtsjahr: ").append(this.geburtsjahr).append("\n");
        } else {
            s.append("Geburtsjahr: n/a\n");
        }

        s.append("Konto/Konten:\n");

        for (int i = 0; i < index; i++) {
            if (zugKonto[i] != null) {
                s.append("    ").append(zugKonto[i]).append("\n");
            }
        }

        return s.toString();
    }

    void setKonto(Konto pKonto) {
        if (this.index != this.zugKonto.length) {
            this.zugKonto[this.index] = pKonto;
            this.index++;
        } else {
            this.zugKonto = Arrays.copyOf(zugKonto, index + 1);
            this.zugKonto[this.index] = pKonto;
            this.index++;
        }
        pKonto.setZugKunde(this);
    }

}
