public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Finansik domowy 2023 ver 0.1");
        System.out.println();
        System.out.println("Koszty życia maj 2023");


        Kredyty kredyt = new Kredyty();
        kredyt.setnazwaBanku("ING");
        System.out.println(kredyt.getnazwaBanku());

        Kredyty rataKredytu1 = new Kredyty();
        rataKredytu1.setKwotaRatyKredytu(199.21);

        Kredyty rataKredytu2 = new Kredyty();
        rataKredytu2.setKwotaRatyKredytu(419.82);

        Kredyty rataKredytu3 = new Kredyty();
        rataKredytu3.setKwotaRatyKredytu(233.06);

        Kredyty rataKredytu4 = new Kredyty();
        rataKredytu4.setKwotaRatyKredytu(742.86);

        Kredyty ing = new Kredyty();
        System.out.println("Rata kredytu: " + rataKredytu1.getkwotaRatyKredytu());
        System.out.println("Rata kredytu: " + rataKredytu2.getkwotaRatyKredytu());
        System.out.println("Rata kredytu: " + rataKredytu3.getkwotaRatyKredytu());
        System.out.println("Rata kredytu: " + rataKredytu4.getkwotaRatyKredytu());

        Raty rata1 = new Raty();
        rata1.setKwotaRaty(96.60);
        Raty rata2 = new Raty();
        rata2.setKwotaRaty(41.17);
        Raty rata3 = new Raty();
        rata3.setKwotaRaty(83);
        Raty rata4 = new Raty();
        rata4.setKwotaRaty(25.80);
        Raty rata5 = new Raty();
        rata5.setKwotaRaty(28.05);

        System.out.println("\nRaty:");
        Raty rata = new Raty();
        rata1.setnazwaBanku("Rata w AliorBank(AGD): ");
        System.out.println(rata1.getnazwaBanku() + rata1.getKwotaRaty());
        rata1.setnazwaBanku("Rata w AliorBank(Blat): ");
        System.out.println(rata1.getnazwaBanku() + rata2.getKwotaRaty());
        rata1.setnazwaBanku("Rata w AliorBank(TV): ");
        System.out.println(rata1.getnazwaBanku() + rata3.getKwotaRaty());
        rata1.setnazwaBanku("Rata w AliorBank(IKEA): ");
        System.out.println(rata1.getnazwaBanku() + rata4.getKwotaRaty());
        rata1.setnazwaBanku("Rata w AliorBank(IKEA): ");
        System.out.println(rata1.getnazwaBanku() + rata5.getKwotaRaty());


        InneWydatki wydatki = new InneWydatki(60, 30, 70);
        System.out.println(wydatki.x);

        boolean sprawdzenie;
        if(wydatki.x < wydatki.y){
            System.out.println("debil");
            }
        else
            System.out.println("Mistrz");


        System.out.print(wydatki.z);


    }



}






