 public class Kredyty {
     private String nazwaBanku;
     String getnazwaBanku() {
         return "Kredyty: " + this.nazwaBanku;
     }
     void setnazwaBanku(String nazwaBanku) {
         this.nazwaBanku = nazwaBanku;

     }


     private double kwotaRatyKredytu;
     double getkwotaRatyKredytu() {
        return this.kwotaRatyKredytu;

     }

     void setKwotaRatyKredytu(double kwotaRatyKredytu){
         this.kwotaRatyKredytu =  kwotaRatyKredytu;
     }

     double obliczRate;
     String calaNazwa;
     int calyKredyt;

    double kwotaRatyKredytu() {
     System.out.println(kwotaRatyKredytu);
     return kwotaRatyKredytu;
 }
    double obliczRate(){
        System.out.println(calyKredyt + kwotaRatyKredytu);
    return obliczRate;
 }

    String calaNazwa(){
    System.out.println("W banku " + nazwaBanku
            + " mam " + kwotaRatyKredytu + " i zostało mi do spłaty "
            + (calyKredyt - kwotaRatyKredytu));
    return calaNazwa;
}

    int calyKredyt(){
    System.out.println("Kwota calego gredytu to:" + calyKredyt);
    return calyKredyt;

}

}
