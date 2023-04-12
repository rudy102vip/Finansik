public class Main {
    public static void main(String[] args) {

        System.out.println("Finansik ver 0.1");

        kredyty rata1 = new kredyty();
        rata1.nazwaBanku = "ING";
        rata1.kwotaKredytu = 956;
        rata1.rata = 200;
        rata1.calyKredyt = 2500;

        kredyty rata2 = new kredyty();
        rata2.nazwaBanku = "AliorBank";
        rata2.kwotaKredytu = 658;
        rata2.rata = 150;
        rata2.calyKredyt = 1500;


       rata1.nazwaBanku();
       rata2.nazwaBanku();

       rata1.kwotaKredytu();
       rata2.kwotaKredytu();

       rata1.rata();
       rata2.rata();

       rata1.obliczRate();
       rata2.obliczRate();

       rata1.calaNazwa();
       rata2.calaNazwa();

       rata1.calyKredyt();
       rata2.calyKredyt();





    }


}