public class kredyty {
    String nazwaBanku;
    int kwotaKredytu;
    int rata;
    int obliczRate;
    String calaNazwa;
    int poRacie;

String nazwaBanku() {
    System.out.println(nazwaBanku);
    return nazwaBanku;

}
 int kwotaKredytu() {
     System.out.println(kwotaKredytu);
     return kwotaKredytu;
 }

 int rata() {
    System.out.println(rata);
    return rata;
 }
 int obliczRate(){
    System.out.println(kwotaKredytu - rata);
    return obliczRate;
 }

String calaNazwa(){
    System.out.println("W banku " + nazwaBanku
            + " mam " + kwotaKredytu + " i zostało mi do spłaty "
            + (kwotaKredytu - rata));
    return calaNazwa;

}


}
