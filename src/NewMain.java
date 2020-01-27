public class NewMain {

    public static void main(String[] args) {
        Kunde k1 = new Kunde("Peter");
        System.out.println(k1.info());
        k1.setKonto(new Konto(23));
        System.out.println(k1.info());
        System.out.println(k1.getZugKonto(23).getZugKunde().name);
    }

}
