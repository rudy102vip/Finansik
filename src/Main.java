public class Main {
    public static void main(String[] args) {

        System.out.println("Finansik ver 0.1");

        kredyty kredyt1 = new kredyty();
        kredyt1.nazwaBanku = "ING";
        kredyt1.kwotaKredytu = 956;
        kredyt1.rata = 200;
        kredyt1.calyKredyt = 2500;

        kredyty rata2 = new kredyty();
        rata2.nazwaBanku = "AliorBank";
        rata2.kwotaKredytu = 658;
        rata2.rata = 150;
        rata2.calyKredyt = 1500;

        kredyty rata3 = new kredyty();
        rata3.nazwaBanku = "Santander Bank Polska";
        rata3.kwotaKredytu = 256;
        rata3.rata = 48;
        rata3.calyKredyt = 2560;



       kredyt1.nazwaBanku();
       rata2.nazwaBanku();
       rata3.nazwaBanku();

       kredyt1.kwotaKredytu();
       rata2.kwotaKredytu();
       rata3.kwotaKredytu();

       kredyt1.rata();
       rata2.rata();
       rata3.rata();

       kredyt1.obliczRate();
       rata2.obliczRate();
       rata3.obliczRate();

       kredyt1.calaNazwa();
       rata2.calaNazwa();
       rata3.calaNazwa();

       kredyt1.calyKredyt();
       rata2.calyKredyt();
       rata3.calyKredyt();





    }


}