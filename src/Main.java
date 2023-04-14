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


    }



}






